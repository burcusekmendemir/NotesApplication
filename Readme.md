NotesApp - Spring Boot Uygulamasý

      - Bu proje, kullanýcýlarýn kiþisel notlarýný kaydedip görüntüleyebileceði basit bir Spring Boot uygulamasýdýr. 
      - Uygulama, Spring Security, Thymeleaf, ve JPA kullanýlarak geliþtirilmiþtir. 
      - Her kullanýcý yalnýzca kendi notlarýný görebilir ve yönetebilir. 
      - Uygulama Bootstrap ile tasarlanmýþtýr.


Projenin Özellikleri:

    - Not Ekleme ve Silme: Kullanýcýlar notlarýný kaydedebilir ve silebilir.
    - Notlarýn Sýralanmasý: Notlar, sondan baþa doðru (en yeni not en üstte) sýralanýr.
    - Karakter Sýnýrý: Notlar maksimum 1000 karakter olabilir.
    - Kullanýcýya Özel Notlar: Her kullanýcý yalnýzca kendi notlarýný görebilir.
    - Kullanýcý Giriþi: Uygulama, kullanýcý giriþi yaparak açýlýr ve güvenli hale getirilmiþtir.
    - Çýkýþ Yapma: localhost:8080/logout ile çýkýþ yapýlabilir ve ardýndan login ekranýna yönlendirilir.
    - Bootstrap Ýle Tasarým

Güvenlik ve Kimlik Doðrulama:

    - Spring Security kullanýlarak, kullanýcý giriþ/çýkýþ iþlemleri yönetilir.
    - Otomatik Kullanýcý Oluþturma: user1, user2 ve user3 kullanýcýlarý, sistem açýldýðýnda otomatik olarak oluþturulur. Bu kullanýcýlarýn þifresi "1234" olarak ayarlanmýþtýr.
    - Giriþ ve Yönlendirme: Kullanýcý baþarýyla giriþ yaptýktan sonra otomatik olarak notlar sayfasýna (note.html) yönlendirilir.

Kullanýlan Teknolojiler:

    - Spring Boot: Ana uygulama çerçevesi.
    - Spring Security: Kullanýcý kimlik doðrulama ve güvenlik için kullanýlýr.
    - Spring Data JPA: Veritabaný iþlemleri için kullanýlýr.
    - Thymeleaf: HTML þablon motoru olarak kullanýlýr.
    - Bootstrap: Kullanýcý arayüzü tasarýmý için kullanýlýr.


Varsayýlan kullanýcýlar:

    - user1 : þifre: 1234
    - user2 : þifre: 1234
    - user3 : þifre: 1234