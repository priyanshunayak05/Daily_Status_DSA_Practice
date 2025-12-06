-- Last updated: 12/6/2025, 11:58:23 PM
# Write your MySQL query statement below

SELECT id,
    CASE
        -- Case 1: Root Node (no parent)
        WHEN tree.p_id IS NULL THEN 'Root'
        
        -- Case 2: Leaf Node (its id does not appear in the p_id column of any other record)
        WHEN tree.id NOT IN (
            SELECT DISTINCT p_id
            FROM tree
            WHERE p_id IS NOT NULL
        ) THEN 'Leaf'
        
        -- Case 3: Inner Node (it has a parent, and it is a parent to others)
        ELSE 'Inner'
    END AS Type
FROM tree
ORDER BY tree.id;