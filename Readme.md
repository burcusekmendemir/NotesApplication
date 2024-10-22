NotesApp - Spring Boot Uygulamas�

      - Bu proje, kullan�c�lar�n ki�isel notlar�n� kaydedip g�r�nt�leyebilece�i basit bir Spring Boot uygulamas�d�r. 
      - Uygulama, Spring Security, Thymeleaf, ve JPA kullan�larak geli�tirilmi�tir. 
      - Her kullan�c� yaln�zca kendi notlar�n� g�rebilir ve y�netebilir. 
      - Uygulama Bootstrap ile tasarlanm��t�r.


Projenin �zellikleri:

    - Not Ekleme ve Silme: Kullan�c�lar notlar�n� kaydedebilir ve silebilir.
    - Notlar�n S�ralanmas�: Notlar, sondan ba�a do�ru (en yeni not en �stte) s�ralan�r.
    - Karakter S�n�r�: Notlar maksimum 1000 karakter olabilir.
    - Kullan�c�ya �zel Notlar: Her kullan�c� yaln�zca kendi notlar�n� g�rebilir.
    - Kullan�c� Giri�i: Uygulama, kullan�c� giri�i yaparak a��l�r ve g�venli hale getirilmi�tir.
    - ��k�� Yapma: localhost:8080/logout ile ��k�� yap�labilir ve ard�ndan login ekran�na y�nlendirilir.
    - Bootstrap �le Tasar�m

G�venlik ve Kimlik Do�rulama:

    - Spring Security kullan�larak, kullan�c� giri�/��k�� i�lemleri y�netilir.
    - Otomatik Kullan�c� Olu�turma: user1, user2 ve user3 kullan�c�lar�, sistem a��ld���nda otomatik olarak olu�turulur. Bu kullan�c�lar�n �ifresi "1234" olarak ayarlanm��t�r.
    - Giri� ve Y�nlendirme: Kullan�c� ba�ar�yla giri� yapt�ktan sonra otomatik olarak notlar sayfas�na (note.html) y�nlendirilir.

Kullan�lan Teknolojiler:

    - Spring Boot: Ana uygulama �er�evesi.
    - Spring Security: Kullan�c� kimlik do�rulama ve g�venlik i�in kullan�l�r.
    - Spring Data JPA: Veritaban� i�lemleri i�in kullan�l�r.
    - Thymeleaf: HTML �ablon motoru olarak kullan�l�r.
    - Bootstrap: Kullan�c� aray�z� tasar�m� i�in kullan�l�r.


Varsay�lan kullan�c�lar:

    - user1 : �ifre: 1234
    - user2 : �ifre: 1234
    - user3 : �ifre: 1234