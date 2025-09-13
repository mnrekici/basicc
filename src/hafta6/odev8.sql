--Tablo oluşturma
CREATE TABLE employee (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    birthday DATE,
    email VARCHAR(100)
);

--Mockaroo verilerini ekleme
INSERT INTO employee (name, birthday, email) VALUES
('Ali Yılmaz', '1990-05-15', 'ali.yilmaz@example.com'),
('Ayşe Kaya', '1985-12-20', 'ayse.kaya@example.com'),
('Mehmet Demir', '1992-08-10', 'mehmet.demir@example.com'),
('Zeynep Çelik', '1988-03-25', 'zeynep.celik@example.com'),
('Ahmet Şahin', '1995-07-30', 'ahmet.sahin@example.com'),
('Fatma Koç', '1991-11-05', 'fatma.koc@example.com'),
('Mustafa Öztürk', '1987-02-14', 'mustafa.ozturk@example.com'),
('Emine Yıldız', '1993-09-18', 'emine.yildiz@example.com'),
('Hüseyin Aydın', '1989-06-22', 'huseyin.aydin@example.com'),
('Seda Kara', '1994-04-12', 'seda.kara@example.com'),
('Murat Tekin', '1986-01-07', 'murat.tekin@example.com'),
('Elif Altın', '1990-10-30', 'elif.altin@example.com'),
('Okan Erdem', '1984-07-19', 'okan.erdem@example.com'),
('Deniz Yılmaz', '1992-12-03', 'deniz.yilmaz@example.com'),
('Gülay Arslan', '1988-05-28', 'gulay.arslan@example.com'),
('Cem Korkmaz', '1993-03-15', 'cem.korkmaz@example.com'),
('Selin Demirci', '1989-08-08', 'selin.demirci@example.com'),
('Burak Çetin', '1991-02-23', 'burak.cetin@example.com'),
('Pınar Özer', '1987-09-11', 'pinar.ozer@example.com'),
('Volkan Şen', '1994-06-26', 'volkan.sen@example.com'),
('Derya Kaplan', '1990-01-14', 'derya.kaplan@example.com'),
('Tolga Güneş', '1985-04-09', 'tolga.gunes@example.com'),
('Nihan Yıldırım', '1992-11-17', 'nihan.yildirim@example.com'),
('Serkan Doğan', '1988-07-22', 'serkan.dogan@example.com'),
('Melis Sarı', '1995-10-05', 'melis.sari@example.com'),
('İsmail Kılıç', '1989-12-28', 'ismail.kilic@example.com'),
('Aylin Aslan', '1993-05-19', 'aylin.aslan@example.com'),
('Koray Yücel', '1987-08-03', 'koray.yucel@example.com'),
('Leyla Özdemir', '1991-03-26', 'leyla.ozdemir@example.com'),
('Hakan Çakır', '1986-06-14', 'hakan.cakir@example.com'),
('Burcu Taş', '1994-02-07', 'burcu.tas@example.com'),
('Umut Koçak', '1990-09-21', 'umut.kocak@example.com'),
('Sema Ates', '1985-11-30', 'sema.ates@example.com'),
('Onur Güler', '1992-04-16', 'onur.guler@example.com'),
('İpek Yavuz', '1988-01-09', 'ipek.yavuz@example.com'),
('Barış Kaya', '1993-07-24', 'baris.kaya@example.com'),
('Gizem Erdoğan', '1989-10-13', 'gizem.erdogan@example.com'),
('Can Öztürk', '1991-05-08', 'can.ozturk@example.com'),
('Aslı Demir', '1987-12-01', 'asli.demir@example.com'),
('Eren Şahin', '1994-08-27', 'eren.sahin@example.com'),
('Merve Akar', '1990-02-18', 'merve.akar@example.com'),
('Berk Yılmaz', '1986-03-12', 'berk.yilmaz@example.com'),
('Ceyda Polat', '1992-06-05', 'ceyda.polat@example.com'),
('Tuncay Korkmaz', '1988-09-29', 'tuncay.korkmaz@example.com'),
('Nazlı Çelik', '1995-01-22', 'nazli.celik@example.com'),
('Samet Güngör', '1989-04-15', 'samet.gungor@example.com'),
('Selinay Yıldız', '1993-11-08', 'selinay.yildiz@example.com'),
('Mert Özer', '1987-07-02', 'mert.ozer@example.com'),
('Ece Demirtaş', '1991-12-25', 'ece.demirtas@example.com'),
('Kaan Yıldırım', '1994-03-19', 'kaan.yildirim@example.com');

--Update işlemleri
-- id sütununa göre güncelleme
UPDATE employee
SET name = 'Yeni İsim', birthday = '1992-08-25', email = 'yeni.email@example.com'
WHERE id = 5;

-- name sütununa göre güncelleme
UPDATE employee
SET birthday = '1988-07-15', email = 'guncel1@example.com'
WHERE name = 'Ali Yılmaz';

-- birthday sütununa göre güncelleme
UPDATE employee
SET name = 'Doğumgünü Güncel', email = 'dogumgunu@example.com'
WHERE birthday = '1990-05-15';

-- email sütununa göre güncelleme
UPDATE employee
SET name = 'Email Güncel', birthday = '1992-06-10'
WHERE email = 'ali.yilmaz@example.com';

-- LIKE operatörü ile güncelleme
UPDATE employee
SET email = 'yeni.domain@company.com'
WHERE email LIKE '%@example.com';


--Delete işlemleri
-- id sütununa göre silme
DELETE FROM employee WHERE id = 3;

-- name sütununa göre silme
DELETE FROM employee WHERE name = 'Ayşe Kaya';

-- birthday sütununa göre silme
DELETE FROM employee WHERE birthday < '1980-01-01';

-- email sütununa göre silme
DELETE FROM employee WHERE email LIKE '%@example.com';

-- BETWEEN operatörü ile silme
DELETE FROM employee WHERE id BETWEEN 40 AND 42;