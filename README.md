# TugasKelimaPBO
Pada praktikum kali ini, akan dipelajari konsep CRUD dan Insert dengan menggunakan Java GUI dan konsep mengenai _custom exception_. Dimana, dalam praktikum ini tampilan tabel _database_ akan muncul atau tampil di tampilan GUI nya.

# Konsep CRUD dengan Java GUI (_Create, Read/ Select, Update_, dan _Delete_), _Insert_, dan _Clear_
## Create
Dalam praktikum ini untuk _create table_ sudah dibuat di _database_ di PostgreSQL, sehingga di Netbeans tinggal menghubungkannya saja.
## Insert
Dalam praktikum ini, untuk _Insert_ dibuat di baris _code_ untuk _button insert_. Dimana, pada **Class TokoBunga**, terdapat pada _method_ **BtnInsertActionPerformed** dengan _modifier private_. Dimana _Insert_ ini digunakan untuk menambahkan data dalam _database_.


Berikut SQL dengan _code_ nya:

**String sql = "INSERT INTO tokobunga VALUES(?,?,?,?,?,?,?)";**
## Read/ Select
Dalam praktikum ini, untuk _Select_ dibuat di baris _code_ untuk _method_ menampilkan isi tabel. Dimana, pada **Class TokoBunga**, terdapat pada _method_ **showTable()** dengan _modifier public_. Dimana _Select_ ini digunakan untuk menampilkan data dalam _database_.


Berikut SQL dengan _code_ nya:

**String sql = "SELECT * FROM tokobunga ORDER BY idbunga";**
## Update
Dalam praktikum ini, untuk _Update_ dibuat di baris _code_ untuk _button update_. Dimana, pada **Class TokoBunga**, terdapat pada _method_ **BtnUpdateActionPerformed** dengan _modifier private_. Dimana _Update_ ini digunakan untuk memperbarui data dalam _database_.


Berikut SQL dengan _code_ nya:

**String sql = "UPDATE tokobunga SET namabunga= ?, kategoribunga= ?, deskripsiproduk= ?, harga= ?, stok= ?, ukuran= ? WHERE idbunga= ?";**
## Delete
Dalam praktikum ini, untuk _Delete_ dibuat di baris _code_ untuk _button delete_. Dimana, pada **Class TokoBunga**, terdapat pada _method_ **BtnDeleteActionPerformed** dengan _modifier private_. Dimana _Delete_ ini digunakan untuk menghapus data dalam _database_.


Berikut SQL dengan _code_ nya:

**String deleteSql = "DELETE FROM tokobunga WHERE idbunga= ?";**
## Clear
Dalam praktikum ini, untuk _Clear_ dibuat di baris _code_ untuk _button clear_. Dimana, pada **Class TokoBunga**, terdapat pada _method_ **BtnClearActionPerformed** dimana isinya adalah memanggil _method_ **bersih()** dengan _modifier private_. Dimana _Clear_ ini digunakan untuk menghapus atau mereset isi data di _text field_.

# Konsep _Custom Exception_
Dalam praktikum ini terdapat konsep _custom exception_, yaitu kemampuan untuk membuat _class_ pengecualian sendiri di luar dari _exception_ bawaan Java. Seperti pada praktikum di **Class BilanganKuadrat**, dimana dalam _class_ tersebut terdapat _class_ yang digunakan untuk membuat _class exception_ dengan nama **"KuadratTidakTepatException"**, dalam **Class BilanganKuadrat** _class exception_ nya adalah sebagai berikut:


**class KuadratTidakTepatException extends Exception** --> _Class_ ini mewarisi sifat dari _class exception_ bawaan Java.

Kemudian, pada praktikum di **Class Perkalian**, dimana dalam _class_ tersebut terdapat _class_ yang digunakan untuk membuat _class exception_ dengan nama **"PerkalianTidakTepatException"**, dalam **Class Perkalian** _class exception_ nya adalah sebagai berikut:


**class PerkalianTidakTepatException extends RuntimeException** --> _Class_ ini mewarisi sifat dari _class exception_ bawaan Java, namun berbeda dengan _exception_, dia tidak mengharuskan mendeklarasikan _method_nya dengan "throws".


# **KETERANGAN:**
UIN Sunan Ampel Surabaya 2025 


Dosen Pengampu: Bayu Adhi Nugroho, Ph. D.


