 --Ortalama Film Uzunluğundan Fazla Uzunluğa Sahip Film Sayısı
SELECT COUNT(*)
FROM film
WHERE length > (SELECT AVG(length) FROM film);


--En Yüksek Rental_Rate Değerine Sahip Film Sayısı
SELECT COUNT(*)
FROM film
WHERE rental_rate = (SELECT MAX(rental_rate) FROM film);

-- En Düşük Rental_Rate ve En Düşük Replacement_Cost Değerlerine Sahip Filmler
SELECT title, rental_rate, replacement_cost
FROM film
WHERE rental_rate = (SELECT MIN(rental_rate) FROM film)
AND replacement_cost = (SELECT MIN(replacement_cost) FROM film);

--En Fazla Alışveriş Yapan Müşteriler (Payment Tablosuna Göre)
SELECT customer_id, COUNT(payment_id) AS transaction_count
FROM payment
GROUP BY customer_id
ORDER BY transaction_count DESC;