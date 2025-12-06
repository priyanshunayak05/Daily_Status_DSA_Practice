-- Last updated: 12/6/2025, 11:57:34 PM
SELECT p.product_name, s.year, s.price  
FROM Sales s  
JOIN Product p  
ON s.product_id = p.product_id;