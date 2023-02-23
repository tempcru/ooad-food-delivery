<template> 
  <div class="frame-head">
      <!-- Logo Home -->
      <div class="frame-head__brand">
        <label class="frame-head__brand__name" @click="goToHome"><strong>SDS 배달 </strong></label>
      </div>
  </div>
</template>

<script>
export default {
  name: "WebHeader",
  computed: {
  },
  methods: {
    goToHome(){

    },

  },
};
</script>

<style scoped>

.frame-head{
  position: absolute;top:0;left:0;right:0;
  height: 60px; 
  background-color: #3a7dd4;
  color: beige;
  display: flex;
  justify-content: space-between;
  align-items: stretch;
  z-index: 2000;
  border-bottom: 1px solid rgba(68,75,82,0.1);
}

.frame-head__brand{
  position: relative;
  display: inline-flex;
  flex-direction: column;
  justify-content: center;
  width: 200px;
  flex:0 0 auto;
  margin-left: 16px;
}

.frame-head__brand__name{
  cursor: pointer;
  font-size: 24px;
  line-height: 24px;
  margin-top: 4px;
}

.frame-head__menu{
  position: relative;
  flex:1 1 auto;white-space: nowrap;
}

.frame-head__menu__wrapper{
  position: relative;
  flex:1 1 auto;white-space: nowrap;
}

.frame-head__menu__name{
  position: relative;
  display: inline-block;
  cursor: pointer;
  user-select: none;
  margin-top: 18px;
  margin-left: 240px;
  width: 5%;
  font-size: 18px;
}

.frame-head__profile{
  position: absolute;top:10px;right:24px;
  display: inline-block;
  margin-top: 24px;
  font-size: 18px;
}

</style>