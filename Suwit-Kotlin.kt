fun main(args: Array<String>) {
    //Menangkap kebutuhan
    val nama = args[0]
    val pilihan = args[1]
    val pilihanKomputer = kotlin.random.Random.nextInt(9)
    var comp: String = ""
    
    //kondisi komputer
    if(pilihanKomputer < 3){
        comp = "gajah"
    }else if(pilihanKomputer < 6){
        comp = "orang"
    }else if(pilihanKomputer < 9){
        comp = "semut"
    }
    
    //rule
    if(pilihan == comp){
        println("Halo $nama hasilnya SERI!!!")
    }else if (pilihan == "orang") {
        if (comp == "gajah"){
            println("Halo $nama hasilnya KOMPUTER MENANG!!")
        }else if (comp == "semut"){
            println("Halo $nama hasilnya KAMU MENANG !!")
        }
    }else if (pilihan == "semut") {
        if (comp == "orang"){
            println("Halo $nama hasilnya KOMPUTER MENANG!!")
        }else if (comp == "gajah"){
            println("Halo $nama hasilnya KAMU MENANG !!")
        }
    }else if (pilihan == "gajah") {
        if (comp == "orang"){
            println("Halo $nama hasilnya KAMU MENANG!!")
        }else if (comp == "semut"){
            println("Halo $nama hasilnya KOMPUTER MENANG !!")
        }
    }
}
