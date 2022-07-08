>**DISCLAIMER**\
>Semua informasi di sini diterbitkan dengan tujuan baik dan murni hanya untuk informasi umum.\
>Benar atau tidaknya, kembali kepada referensi masing-masing individu.\
>Sekian, terima kasih.
>
>>**Panduan Penggunaan Aplikasi :**\
>		1. Aplikasi dijalankan melalui Command Line.\
>               2. Menuliskan sintaks yang dibutuhkan lalu jalankan.\
>               3. Periksa hasilnya pada Github.

&nbsp;
## Git and GitHub

&nbsp;
### Apa itu Git? Kenapa penting bagi seorang Programmer ?
**Git** adalah salah satu tool yang sering digunakan dalam proyek pengembangan software. **Version control system** membantu developer melacak perubahan yang mereka lakukan terhadap basis kode.

Tak hanya itu, sistem ini juga mencatat siapa saja yang membuat perubahan serta memulihkan kode yang telah dihapus atau dimodifikasi. Karena Git menyimpan banyak salinan kode di repositori, maka tidak ada kode yang saling tertimpa.

Git merupakan tool utama yang pasti akan kamu gunakan setiap hari, sepanjang karirmu sebagai developer. Dengan ini kamu dapat tahu apa saja yang kamu lakukan setiap saat dan berkolaborasi dengan rekan lainnya juga. Anggaplah Git sebagai mesin waktu untuk berbagai kerjaan dan file/folder yang kamu kelola.

&nbsp;
### GitHub
Sedangkan GitHub merupakan tempat sekaligus komunitas untuk para developer berbagai code dan berkolaborasi dalam berbagai project software. Bahkan modern ini, profil GitHub dapat menggantikan resume/CV untuk melamar pekerjaan!

GitHub adalah manajemen proyek dan sistem versioning code sekaligus platform jaringan sosial yang dirancang khusus bagi para developer. Lalu, apa saja fungsi GitHub? Dengan platform ini, Anda bisa bekerja bersama-sama dengan rekan dariberbagai berlahan dunia, merencanakan proyek, dan bahkan tracking (melacak) pekerjaan Anda.

&nbsp;
### REPOSITORY
Repositori atau repo adalah direktori penyimpanan file proyek. Di sini, Anda bisa menyimpan apa pun yang berkaitan dengan proyek yang sedang Anda buat, misalnya file kode, gambar, atau audio. Repo sendiri bertempat di penyimpanan atau storage GitHub atau repositori lokal di komputer Anda.

&nbsp;
### BRANCH
Branch merupakan salinan dari repositori. Anda bisa menggunakan branch ketika akan melakukan suatu pengembangan atau development secara terpisah. Pekerjaan atau task yang Anda kerjakan di branch tidak akan memengaruhi repositori pusat atau branch lainnya. Jika pengembangannya sudah selesai, Anda bisa menggabungkan branch saat ini ke branch lainnya dan juga repositori pusat dengan menggunakan pull request.

&nbsp;
### Beberapa Sintak Git dan Penjelasan Singkat

'git add .'\
menambahkan semua file ke staging area

'git add nama_file'\
menambahkan file tertentu ke staging area

'git commit -m "komentar"'\
commit perubahan pada staged file

'git commit -m nama_file'\
commit perubahan staged file tertentu

'git push'\
mengirim file yang di commit ke remote repository

'git fetch'\
download kontent file konten dari remote repository

'git pull'\
menarik file dari remote repository ke local repository

'git pull -- rebase'\
menarik file dari remote dan replace code file local dengan code file di remote.
jadi semua code di local akan mengikuti code yang di remote sama persis

'git branch'\
melihat nama branch

'git branch nama_branch'\
membuat branch

'git push --set-upstream origin nama_branch'\
push branch local yang baru dibuat

'git branch -d nama_branch'\
delete local branch

&nbsp;