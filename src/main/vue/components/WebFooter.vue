<template>
  <div class="frame-foot"><div class="footer-name">Copylight Design Pattern 4조</div></div>
</template>

<script>
export default {
  name: "WebFooter"
};
</script>

<style scoped>
.frame-foot {
  background-color: lightgray;
  height: 60px;
  width: 100%;
  left: 0;
  padding-left: 16px;
  position: absolute;
  bottom: 0;
}

.footer-name {
  margin-top: 10px;
  font-size: 16px;
  font-weight: 700;
}
</style>