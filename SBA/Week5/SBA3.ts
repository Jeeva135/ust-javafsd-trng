class Student{

    name:string;
    id:number;
    mark1:number;
    grade:string;

        constructor(mark1:number,grade:string){

            this.mark1=mark1;
            this.grade=grade;
        }

        Calculate():void{

            if(this.mark1>60){
                console.log("Well done, Grade is: "+this.grade);
            }

            else{
                console.log("Grade is: "+this.grade);
            }

        }
}
var cnt=0;
var arr_names1:number[]=new Array(4)

for(var i=0;i<arr_names1.length;i++){
    arr_names1[i]=i+10;
    console.log(arr_names1[i]);
}

var obj1=new Student(70,"A");
obj1.Calculate();

