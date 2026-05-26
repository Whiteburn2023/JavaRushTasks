-- Write your code here:
UPDATE author
SET full_name = CASE
    WHEN full_name = 'C. S. Lewis' THEN 'Clive Staples Lewis'
    WHEN full_name = 'J. R. R. Tolkien' THEN 'John Ronald Reuel Tolkien'
    WHEN full_name = 'Friedrich Nietzsche' THEN 'Friedrich Wilhelm Nietzsche'
    WHEN full_name = 'Stephen King' THEN 'Stephen Edwin King'
    WHEN full_name = 'Aldous Huxley' THEN 'Aldous Leonard Huxley'
    ELSE full_name
END
;