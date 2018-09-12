var array = [];
for(var i = 0; i < 1000000; i++){array.push(i);}

var a = {}, b = {}, c = {}, d = {};

function loop1(){
    var time = new Date().getTime();
    array.forEach(item => { a[item] = item; });
    return new Date().getTime() - time;
}

function loop2(){
    var time = new Date().getTime();
    array.forEach(item => { b[item] = item; });
    return new Date().getTime() - time;
}

function loop3(){
    var time = new Date().getTime();
    array.forEach(item => {
        c[item] = item;
        d[item] = item;
    });
    return new Date().getTime() - time;
}

var sum1 = 0, sum2 = 0, sum3 = 0;
for(var i = 0; i < 100; i++){
    sum1 += loop1();
    sum2 += loop2();
    sum3 += loop3();
    console.log("第n次循环：", i);
}

console.log("第一次循环平均值：", sum1/100);
console.log("第二次循环平均值：", sum2/100);
console.log("第三次循环平均值：", sum3/100);