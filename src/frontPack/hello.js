document.write("hellow JS<br>");
//alert(1);

var x=10;
document.write("x变量值为：" +x + "<br>");

console.log("end");

document.write("<br>");

function print() {
    document.write("function打印！<br>");
}

function print2(message){
    document.write(message);
}

print();
print2("<br>");
print2("带参数的打印啊");
print2("<br><br>");


function calc(x,y){
    return x+y;
}

var sum = calc(3,5);
print2("3 + 5 = " + sum);




print2("<p><b>-------------以上是头部JS输出-----------</b></p>");