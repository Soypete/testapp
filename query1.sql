-- select the sum of the total amount spent of wach purchase
SELECT SUM(Total)
--using invoices table
FROM invoices
--left join on invoice_items to access total proces data
LEFT JOIN invoice_items ON invoices.InvoiceID = invoice_items.InvoiceID
--selects the customer in to be 3
    WHERE invoices.CustomerId=3;






