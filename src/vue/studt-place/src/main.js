import { createApp } from 'vue'
import App from './App.vue'
import Common from './common/common.js'
import axios from 'axios'
import router from "./router/router";
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
import jQuery from 'jquery';
import bootstrap from 'bootstrap'
import CommonButton from "./components/common/CommonButton";
import FrameHeader from "./components/frame/FrameHeader";

axios.defaults.baseURL = 'http://localhost:8080/'
axios.defaults.headers.get['Content-Type'] = 'application/json;charset=utf-8'
axios.defaults.headers.get['Access-Control-Allow-Origin'] = '*'
const app = createApp(App)
app.use(router)
app.use(jQuery)
app.use(bootstrap)
app.use(CommonButton)
app.use(FrameHeader)
app.mixin(Common)
app.mount("#app")

