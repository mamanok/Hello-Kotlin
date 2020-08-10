/*fun main() {
    val schoolOpen = 7
    val schoolClosed = 16
    val now = 20
    val isOpen = now < schoolOpen || now > schoolClosed
    print("School is closed : $isOpen")
}*/
fun main() {
    print("Masukkan Nilai : ")
    val nilai = Integer.valueOf((readLine()))
    if (nilai > 90) {
        val result = nilai < 90 || nilai >  90
        print("Nilai kamu $nilai = A : $result")
    }
    else if (nilai > 80){
        val result = nilai < 80 || nilai >  80
        print("Nilai kamu $nilai = B : $result")
    }
    else if (nilai > 70){
        val result = nilai < 70 || nilai >  70
        print("Nilai kamu $nilai = C : $result")
    }
    else if (nilai > 60){
        val result = nilai < 60 || nilai >  60
        print("Nilai kamu $nilai = D : $result")
    }
    else if (nilai <= 50){
        val result = nilai < 50 || nilai >  50
        print("Nilai kamu $nilai = E : $result")
    }
    else {
        return
    }
    print(nilai)
}