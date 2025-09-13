-- actor ve customer tablolarındaki tüm first_name verileri (tekrarlı)
SELECT first_name FROM actor
UNION ALL
SELECT first_name FROM customer
ORDER BY first_name;

-- actor ve customer tablolarındaki ortak first_name verileri
SELECT first_name FROM actor
INTERSECT
SELECT first_name FROM customer
ORDER BY first_name;

-- actor'da olup customer'da olmayan first_name verileri
SELECT first_name FROM actor
EXCEPT
SELECT first_name FROM customer
ORDER BY first_name;

-- Tekrarlı verilerle kesişen veriler (INTERSECT ALL)
SELECT first_name FROM actor
INTERSECT ALL
SELECT first_name FROM customer
ORDER BY first_name;

-- Tekrarlı verilerle actor'da olup customer'da olmayanlar (EXCEPT ALL)
SELECT first_name FROM actor
EXCEPT ALL
SELECT first_name FROM customer
ORDER BY first_name;

-- Zaten UNION ALL kullandığımız için bu tekrarlı verileri içerir
SELECT first_name FROM actor
UNION ALL
SELECT first_name FROM customer
ORDER BY first_name;