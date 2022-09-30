var global_num=12;
class  Numbers2{
    num_val=13;
    static sval=10;
    storeNum():void{
        var local_num=14;
    }
}
console.log("Global num"+global_num);
console.log(Numbers2.sval);
var obj=new Numbers2();
console.log("Global num:"+obj.num_val);