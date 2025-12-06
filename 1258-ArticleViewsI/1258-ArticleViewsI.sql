-- Last updated: 12/6/2025, 11:57:02 PM
SELECT author_id AS id
FROM Views
WHERE author_id = viewer_id
GROUP BY author_id
HAVING COUNT(id) >= 1
ORDER BY id;