fun main() {
    print("Masukkan Nilai : ")
    val nilai = Integer.valueOf((readLine()))
    if (nilai >= 75) {
        print("Nilai kamu $nilai, selamat ya!")
    } else {
        print("Nilai kamu $nilai,silakan ikuti remidial")
    }
    print(nilai)
}