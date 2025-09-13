--city ve country tabloları INNER JOIN sorgusu
SELECT city.city, country.country
FROM city
INNER JOIN country ON city.country_id = country.country_id;

--customer ve payment tabloları INNER JOIN sorgusu
SELECT payment.payment_id, customer.first_name, customer.last_name
FROM customer
INNER JOIN payment ON customer.customer_id = payment.customer_id;

--customer ve rental tabloları INNER JOIN sorgusu:
SELECT rental.rental_id, customer.first_name, customer.last_name
FROM customer
INNER JOIN rental ON customer.customer_id = rental.customer_id;