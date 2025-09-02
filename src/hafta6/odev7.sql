SELECT rating FROM film
GROUP BY rating;

SELECT replacement_cost FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50;

SELECT store_id, COUNT(*) FROM customer
GROUP BY store_id;

SELECT country_id FROM city
GROUP BY country_id
ORDER BY COUNT(*) DESC
LIMIgitT 1;