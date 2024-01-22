Dokumentacja projektu MH_javaproject1

1.Wstęp

   Projekt MH_javaproject1 to aplikacja webowa napisana w języku Java, używająca technologii Java EE (Enterprise Edition). Aplikacja umożliwia rejestrację studentów, przechowuje ich dane w bazie danych MySQL i wyświetla informacje o zarejestrowanych użytkownikach.

2.Struktura projektu
		Projekt składa się z następujących głównych elementów:
   - Web Pages:
      - WEB-INF: Katalog zawierający pliki konfiguracyjne oraz biblioteki aplikacji.
         - lib: Katalog zawierający biblioteki (JAR) aplikacji, takie jak `mysql-connector-j-8.2.0.jar` i `mysql-connector-java-8.0.23.jar`.
   	 - Views: Katalog zawierający pliki JSP (JavaServer Pages), takie jak `studentsdetails.jsp` i `studentsregister.jsp`.
   - Source Packages:
      - net.javaguides.registration.controller: Pakiet zawierający kontrolery, głównie `StudentsServlet.java`.
      - net.javaguides.registration.dao: Pakiet zawierający klasę dostępu do danych, czyli `StudentsDao.java`.
      - net.javaguides.registration.model: Pakiet zawierający modele danych, takie jak `Students.java` oraz narzędzia, np. `EmailValidator.java`.

3.Opis plików JSP

   - studentsdetails.jsp:
     - Plik JSP wyświetlający informację o pomyślnej rejestracji studenta.

   - studentsregister.jsp:
     - Plik JSP zawierający formularz rejestracyjny dla studentów.

4.Opis klas Java

   - StudentsServlet.java:
     - Główny kontroler obsługujący żądania HTTP związane z rejestracją studentów.
     - Udostępnia formularz rejestracyjny (`doGet`) oraz obsługuje przesłane dane i zapisuje do bazy danych (`doPost`).

   - StudentsDao.java:
     - Klasa dostępu do danych odpowiedzialna za komunikację z bazą danych MySQL.
     - Zawiera metodę `registerStudents`, która dodaje nowego studenta do bazy danych.

   - Students.java:
     - Klasa reprezentująca obiekt studenta, z polami takimi jak imię, nazwisko, email, hasło i stopień.


5.Konfiguracja bazy danych

   - Aplikacja korzysta z bazy danych MySQL.
   - W klasie `StudentsDao` znajdują się ustawienia połączenia z bazą danych (`jdbc:mysql://localhost:3306/students?useSSL=false`, "root", "mh724257").

6.Uruchamianie projektu

   - Aplikację można uruchomić na serwerze Apache Tomcat.
   - Formularz rejestracyjny dostępny jest pod adresem `http://localhost:8080/register`.

7.Rozwiązywanie problemów

   - Jeśli aplikacja nie działa prawidłowo, sprawdź konsole deweloperską przeglądarki oraz logi serwera Tomcat w poszukiwaniu ewentualnych błędów.
   - Po każdym udanym zalogowaniu musisz zmienić drugi parametr w tym przypadku 4
 preparedStatement.setInt(1, 4); 
[row 25, Source Packages/net.javaguides.registration.dao/StudentsDao.java] - ścieżka do wskazanej linii