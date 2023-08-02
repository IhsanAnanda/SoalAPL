# Square JSON Rest API

Jawaban dari soal APL BNI untuk Java Developer.

![SpringJava](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSu6GSLwZWFN9kOMfG31qEoWKN4yyrCOjurAg&usqp=CAU)

## Algoritma

- Membaca nilai n.
- Melakukan pengecekan jika nilai n < 3 maka akan langsung memberikan hasil "Nilai terlalu kecil" atau jika n > 9 maka akan memberikan hasil "Nilai terlalu besar". Jika nilai n diantara 3-9 maka akan lanjut ke langkah berikutnya.
- Membuat 2 variabel untuk membentuk hasil akhir. Variabel tersebut adalah top dan mid.
- Menambahkan simbol "=" sebanyak n kali dengan cara melakukan perulangan dan menyimpannya ke variabel top.
- Menambahkan simbol "|" sebanyak 1 kali ke variabel temp.
- Menambahkan simbol " " (spasi) sebanyak n-2 kali ke variabel temp sebagai pengisi kolom pada 1 baris.
- Menambahkan simbol "|" sebanyak 1 kali ke variabel temp.
- Menambahkan variabel temp ke variabel mid sebanyak n-2 kali.
- Membentuk hasil akhir dengan menggabungkan top + mid + top,
- Mengembalikan hasil akhir.

## Pseudocode

    Fungsi square(n):
        Jika n < 3:
            Kembalikan "Nilai terlalu kecil"
        Jika n > 9:
            Kembalikan "Nilai terlalu besar"
        Inisialisasi StringBuilder untuk bagian 'atas' dan 'tengah' kotak
        atas = StringBuilder()
        tengah = StringBuilder()
        Inisialisasi StringBuilder 'temp' untuk bagian pembentuk 'tengah'
        temp = StringBuilder()
        Perulangan dari i = 0 hingga n-1:
            Tambahkan "=" ke 'atas'
        Perulangan dari i = 0 hingga n-1:
            Jika n == 0 atau n == n-1:
                Tambahkan "|" ke 'temp'
            Selainya:
                Tambahkan " " ke 'temp'
        Perulangan dari i = 0 hingga n-3:
            Tambahkan 'temp' ke 'tengah'
        Kembalikan hasil penggabungan dari 'atas', 'tengah', dan 'atas'

## TestCase

- Pada source code ini sudah termasuk test case untuk n = 2, n = 5, dan n = 10.
- Semua test case sudah terpenuhi.
