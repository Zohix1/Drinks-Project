<template>
  <a-config-provider :locale="locale">
    <div id="app">
      <router-view/>
    </div>
  </a-config-provider>
</template>
<script>
  import zhCN from 'ant-design-vue/lib/locale-provider/zh_CN'
  import enquireScreen from '@/utils/device'
  import {getPlatformConfig} from "@api/api";

  export default {
    data () {
      return {
        locale: zhCN,
      }
    },
    created () {
      this.getPlatformConfigFlag();
      this.getPlatformConfigFlag2();
      let that = this
      enquireScreen(deviceType => {
        // tablet
        if (deviceType === 0) {
          that.$store.commit('TOGGLE_DEVICE', 'mobile')
          that.$store.dispatch('setSidebar', false)
        }
        // mobile
        else if (deviceType === 1) {
          that.$store.commit('TOGGLE_DEVICE', 'mobile')
          that.$store.dispatch('setSidebar', false)
        }
        else {
          that.$store.commit('TOGGLE_DEVICE', 'desktop')
          that.$store.dispatch('setSidebar', true)
        }

      })
    },
    methods: {
      //初始化标题和内容
      getPlatformConfigFlag(){
        getPlatformConfig( "name",{}).then((res)=>{
          console.log(res)
          if(res) {
            window.SYS_TITLE = res
            document.title = res
          }
        })
      },
      //初始化标题和内容
      getPlatformConfigFlag2(){
        getPlatformConfig( "url",{}).then((res)=>{
          console.log(res)
          if(res) {
            window.SYS_URL = getPlatform("url");
          }
        })
      }
    }
  }
</script>
<style>
  #app {
    height: 100%;
  }
</style>