<template>
<div> 
    <div>
        <!-- 음식 목록 -->
        <div v-for="(item, i) in restaurantList">
            <div class="restaurant-menu" @click="onClickRestaurant(item.restaurantId)">
                <div class="restaurant-menu-title">{{item.restaurantId + ':' + item.restaurantName}}</div>
                <div v-if="item.restaurantId === selectedId">
                    <div v-for="(menu) in menuList" class="restaurant-menu-detail" @click="onClickMenu(menu.menuId)">
                        <div>{{menu.name}}</div>
                        <div>{{menu.price + '원'}}</div> 
                        <div class="option-wrapper">
                            <input type="checkbox" v-model="menu.option">option1
                            <input type="checkbox" v-model="menu.option">option2
                            <input type="checkbox" v-model="menu.option">option3
                            <button @click='checkArr()'>check</button>
                        </div>
                    </div>
                </div>
            </div> 
        </div>
    </div>
</div>
</template>

<script>
    export default {
        name: "Home",
        data() {
            return {
                restaurantList: [],
                menuList: [],
                selectedId: '', 
            }
        },
        methods: {
            getRestaurantList(){
                this.$axios.get('/restaurant').then((res) => {
                    this.restaurantList = res.data;
                });
            },
            getMenuList(restaurantId){
                this.$axios.get('/restaurant/'+restaurantId+'/menu').then((res) => {
                    this.menuList = res.data;
                });
            },
            onClickRestaurant(restaurantId){
                this.selectedId = restaurantId;
                this.getMenuList(restaurantId);
            },
            onClickMenu(menuId){

            },
        },
        created() {
             this.getRestaurantList();
        },
    }
</script>

<style lang="scss" scoped>
.restaurant-menu {
    cursor: pointer;
    margin-bottom: 6px;
    padding: 6px;
    min-height: 70px;
    width: calc(100% - 12px);
    border: 1px solid rgb(93, 104, 220);
}

.restaurant-menu:hover {
    background-color: rgb(237, 237, 237); 
}

.restaurant-menu-detail {

    display: flex;
    flex-direction: row;
    flex-wrap: wrap;

    cursor: pointer;
    margin-bottom: 6px;
    padding: 6px;
    min-height: 70px;
    width: calc(100% - 12px);
    background-color: cornsilk;
    border: 1px solid rgb(93, 104, 220);
}

.option-wrapper {

}
</style>