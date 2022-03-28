<template>
  <div>
    <input :type="thisType" :value="thisValue" :class="thisClass" />
  </div>
</template>
<script>
export default {
  name: 'CommonButton',
  props: {
    value: { type: String, default: '' },
    type: { type: String, default: 'button' }
  },
  data () {
    return {
      thisValue: '',
      thisType: '',
      thisClass: ''
    }
  },
  watch: {
    value () {
      this.setValue()
    },
    type () {
      this.setType()
    }
  },
  mounted () {
    this.setValue()
    this.setType()
  },
  methods: {
    setValue () {
      this.thisValue = this.value || ''
    },
    setType () {
      this.thisType = this.type || 'button'
      this.makeClass()
    },
    makeClass () {
      if (this.thisType === 'button') {
        this.thisClass = 'btn btn-info'
      } else if (this.thisType === 'checkbox') {
        this.thisCLass = 'btn btn-check'
      }
    }
  }

}
</script>