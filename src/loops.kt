fun main() {

    //While loop

    var count = 45
    while(count <= 50){
        println("Number is $count")
        count++
    }

    var x = 10
    while(x >= 5){
       println(x)
       x--
    }


    //Do...while loop
    var y = 1
    do {
        println("Number is $y")
        y++
    }
        while(y <= 5)


    //For loop
    for (num in 30..40){
        println("Number is $num")
    }

    for (letter in 'A'..'D'){
        println("letter is $letter")
    }


    for (a in 1..5){
        if (a == 3){
            break
        }
        println(a)
    }


    for (b in 10..15){
        if (b == 13){
            continue
        }
        println(b)

    }

}