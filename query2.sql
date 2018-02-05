SELECT  customers.FirstName, customers.LastName,tracks.Name
From customers--, invoices--, invoice_items, tracks
LEFT JOIN invoices on invoices.CustomerId=customers.CustomerId
LEFT JOIN invoice_items on invoices.InvoiceId=invoice_items.InvoiceId
LEFT JOIN tracks on invoice_items.TrackId = tracks.TrackId
WHERE tracks.name Like "For Those About To Rock%";