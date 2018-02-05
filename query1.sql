SELECT invoices.InvoiceID, invoice_items.InvoiceID
FROM invoices
INNER JOIN (SELECT SUM(UnitPrice)) invoice_items ON invoices.InvoiceID = invoice_items.InvoiceID;




