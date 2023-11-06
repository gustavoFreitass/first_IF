fun main (){
    maiorDeIdade(18)
    number(45)
    number(51)
}

fun maiorDeIdade(idade: Int){
    if(idade >= 18){
        println("Maior de idade")
    }
    else{
        println("Menor de idade")
    }
}

fun number(num: Int){
    if(num in 1..50){
        println("Correto")
    }
    else{
        println("Errado")
    }
}