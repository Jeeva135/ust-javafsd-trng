var a1=[1,2];
var a2=[...a1,3,4];
console.log(a2);
function display(x,...args){
    console.log(x+" "+args);
}
display(1,2,3,4,5,6,7,8,9,10);