<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <CommonButton type="button" value="clickMe" />
    <CommonButton type="checkbox" />

  </div>
</template>

<script>
import CommonButton from "./common/CommonButton";
export default {
  name: 'HelloWorld',
  components: {CommonButton},
  props: {
    msg: String
  },
  async mounted () {
    // this.alert('asd')
    const res = await this.axios({
      method: 'get',
      url: '/api/v1/sample/'
    })
    const data = res.data || ''
    this.alert(data)
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
