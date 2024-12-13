package kaptenallocweb
val dataGeneratedFromKaptenAlloc: Seq[String] = """
-----------------------------------------------------------------
kurs|datum     |dag|kl   |typ         |grupp|rum      |handledare
-----------------------------------------------------------------
Pgk |2024-11-06|ons|13:15|PgkResurstid|D1.09|Alfa     |DAH       
Pgk |2024-11-06|ons|13:15|PgkResurstid|D1.10|Beta     |SAH       
Pgk |2024-11-06|ons|13:15|PgkResurstid|D1.11|Gamma    |ESS       
Pgk |2024-11-06|ons|13:15|PgkResurstid|XA1  |Ambulans1|NIM       
Pgk |2024-11-06|ons|13:15|PgkResurstid|XA2  |Ambulans2|HJR       
Pgk |2024-11-06|ons|15:15|PgkResurstid|D1.05|Alfa     |MAF       
Pgk |2024-11-06|ons|15:15|PgkResurstid|D1.06|Beta     |ANP       
Pgk |2024-11-06|ons|15:15|PgkResurstid|D1.07|Gamma    |NOA       
Pgk |2024-11-06|ons|15:15|PgkResurstid|D1.08|Varg     |RUH       
Pgk |2024-11-06|ons|15:15|PgkResurstid|XA1  |Ambulans1|ELÅ       
Pgk |2024-11-06|ons|15:15|PgkResurstid|XA2  |Ambulans2|HJR       
Pgk |2024-11-07|tor|08:15|PgkResurstid|C1.01|Falk     |NAK       
Pgk |2024-11-07|tor|08:15|PgkResurstid|C1.02|Hacke    |HJR       
Pgk |2024-11-07|tor|08:15|PgkResurstid|C1.03|Panter   |JOE       
Pgk |2024-11-07|tor|08:15|PgkResurstid|C1.04|Ravel    |DAU       
Pgk |2024-11-07|tor|08:15|PgkResurstid|C1.05|Val      |JON       
Pgk |2024-11-07|tor|08:15|PgkResurstid|C1.06|Varg     |NIM       
Pgk |2024-11-07|tor|08:15|PgkResurstid|XA1  |Ambulans1|RUH       
Pgk |2024-11-07|tor|08:15|PgkResurstid|XA2  |Ambulans2|TRF       
Pgk |2024-11-07|tor|13:15|PgkResurstid|D1.12|Alfa     |ADM       
Pgk |2024-11-07|tor|13:15|PgkResurstid|D1.13|Beta     |EDN       
Pgk |2024-11-07|tor|13:15|PgkResurstid|D1.14|Gamma    |MOG       
Pgk |2024-11-07|tor|13:15|PgkResurstid|XA1  |Ambulans1|ELÅ       
Pgk |2024-11-07|tor|13:15|PgkResurstid|XA2  |Ambulans2|MAU       
Pgk |2024-11-07|tor|13:15|PgkResurstid|XA3  |Ambulans3|TRF       
Pgk |2024-11-07|tor|15:15|PgkResurstid|D1.01|Alfa     |VIB       
Pgk |2024-11-07|tor|15:15|PgkResurstid|D1.02|Beta     |JON       
Pgk |2024-11-07|tor|15:15|PgkResurstid|D1.03|Gamma    |JOM       
Pgk |2024-11-07|tor|15:15|PgkResurstid|D1.04|Varg     |EMS       
Pgk |2024-11-07|tor|15:15|PgkResurstid|XA1  |Ambulans1|ELÅ       
Pgk |2024-11-07|tor|15:15|PgkResurstid|XA2  |Ambulans2|HJR       
Pgk |2024-11-08|fre|10:15|PgkLabb     |D1.01|Alfa     |TOS       
Pgk |2024-11-08|fre|10:15|PgkLabb     |D1.02|Beta     |JON       
Pgk |2024-11-08|fre|10:15|PgkLabb     |D1.03|Falk     |JOM       
Pgk |2024-11-08|fre|10:15|PgkLabb     |D1.04|Gamma    |EMS       
Pgk |2024-11-08|fre|10:15|PgkLabb     |D1.05|Hacke    |MAF       
Pgk |2024-11-08|fre|10:15|PgkLabb     |D1.06|Val      |ANP       
Pgk |2024-11-08|fre|10:15|PgkLabb     |D1.07|Varg     |EDN       
Pgk |2024-11-08|fre|10:15|PgkLabb     |XA1  |Ambulans1|SAH       
Pgk |2024-11-08|fre|10:15|PgkLabb     |XA2  |Ambulans2|HJR       
Pgk |2024-11-08|fre|10:15|PgkLabb     |XA3  |Ambulans3|NIM       
Pgk |2024-11-08|fre|10:15|PgkLabb     |XA4  |Ambulans4|SAR       
Pgk |2024-11-08|fre|13:15|PgkLabb     |D1.08|Alfa     |RUH       
Pgk |2024-11-08|fre|13:15|PgkLabb     |D1.09|Beta     |DAH       
Pgk |2024-11-08|fre|13:15|PgkLabb     |D1.10|Falk     |SAH       
Pgk |2024-11-08|fre|13:15|PgkLabb     |D1.11|Gamma    |ESS       
Pgk |2024-11-08|fre|13:15|PgkLabb     |D1.12|Hacke    |ADM       
Pgk |2024-11-08|fre|13:15|PgkLabb     |D1.13|Val      |VIB       
Pgk |2024-11-08|fre|13:15|PgkLabb     |D1.14|Varg     |MOG       
Pgk |2024-11-08|fre|13:15|PgkLabb     |XA1  |Ambulans1|ELÅ       
Pgk |2024-11-08|fre|13:15|PgkLabb     |XA2  |Ambulans2|HJR       
Pgk |2024-11-08|fre|13:15|PgkLabb     |XA3  |Ambulans3|NOA       
Pgk |2024-11-08|fre|13:15|PgkLabb     |XA4  |Ambulans4|SAR       
Pgk |2024-11-08|fre|15:15|PgkLabb     |C1.01|Falk     |NAK       
Pgk |2024-11-08|fre|15:15|PgkLabb     |C1.02|Jupiter  |HAE       
Pgk |2024-11-08|fre|15:15|PgkLabb     |C1.03|Mars     |JOE       
Pgk |2024-11-08|fre|15:15|PgkLabb     |C1.04|Saturnus |DAU       
Pgk |2024-11-08|fre|15:15|PgkLabb     |C1.05|Val      |MAU       
Pgk |2024-11-08|fre|15:15|PgkLabb     |C1.06|Varg     |SAH       
Pgk |2024-11-08|fre|15:15|PgkLabb     |XA1  |Ambulans1|ANP       
Pgk |2024-11-08|fre|15:15|PgkLabb     |XA2  |Ambulans2|HJR       
Pgk |2024-11-08|fre|15:15|PgkLabb     |XA3  |Ambulans3|MOG       
Pgk |2024-11-08|fre|15:15|PgkLabb     |XA4  |Ambulans4|NOA       
Pgk |2024-11-13|ons|13:15|PgkResurstid|D1.09|Alfa     |DAH       
Pgk |2024-11-13|ons|13:15|PgkResurstid|D1.10|Beta     |SAR       
Pgk |2024-11-13|ons|13:15|PgkResurstid|D1.11|Gamma    |ESS       
Pgk |2024-11-13|ons|13:15|PgkResurstid|XA1  |Ambulans1|SAH       
Pgk |2024-11-13|ons|13:15|PgkResurstid|XA2  |Ambulans2|HJR       
Pgk |2024-11-13|ons|15:15|PgkResurstid|D1.05|Alfa     |MAF       
Pgk |2024-11-13|ons|15:15|PgkResurstid|D1.06|Beta     |ANP       
Pgk |2024-11-13|ons|15:15|PgkResurstid|D1.07|Gamma    |NOA       
Pgk |2024-11-13|ons|15:15|PgkResurstid|D1.08|Varg     |RUH       
Pgk |2024-11-13|ons|15:15|PgkResurstid|XA1  |Ambulans1|ELÅ       
Pgk |2024-11-13|ons|15:15|PgkResurstid|XA2  |Ambulans2|HJR       
Pgk |2024-11-14|tor|08:15|PgkResurstid|C1.01|Falk     |NAK       
Pgk |2024-11-14|tor|08:15|PgkResurstid|C1.02|Hacke    |HAE       
Pgk |2024-11-14|tor|08:15|PgkResurstid|C1.03|Panter   |JOE       
Pgk |2024-11-14|tor|08:15|PgkResurstid|C1.04|Ravel    |DAU       
Pgk |2024-11-14|tor|08:15|PgkResurstid|C1.05|Val      |MAU       
Pgk |2024-11-14|tor|08:15|PgkResurstid|C1.06|Varg     |NIM       
Pgk |2024-11-14|tor|08:15|PgkResurstid|XA1  |Ambulans1|NOA       
Pgk |2024-11-14|tor|08:15|PgkResurstid|XA2  |Ambulans2|HJR       
Pgk |2024-11-14|tor|13:15|PgkResurstid|D1.12|Alfa     |ADM       
Pgk |2024-11-14|tor|13:15|PgkResurstid|D1.13|Beta     |EDN       
Pgk |2024-11-14|tor|13:15|PgkResurstid|D1.14|Gamma    |MOG       
Pgk |2024-11-14|tor|13:15|PgkResurstid|XA1  |Ambulans1|ELÅ       
Pgk |2024-11-14|tor|13:15|PgkResurstid|XA2  |Ambulans2|NOA       
Pgk |2024-11-14|tor|13:15|PgkResurstid|XA3  |Ambulans3|TRF       
Pgk |2024-11-14|tor|15:15|PgkResurstid|D1.01|Alfa     |VIB       
Pgk |2024-11-14|tor|15:15|PgkResurstid|D1.02|Beta     |NOA       
Pgk |2024-11-14|tor|15:15|PgkResurstid|D1.03|Gamma    |JOM       
Pgk |2024-11-14|tor|15:15|PgkResurstid|D1.04|Varg     |EMS       
Pgk |2024-11-14|tor|15:15|PgkResurstid|XA1  |Ambulans1|ELÅ       
Pgk |2024-11-14|tor|15:15|PgkResurstid|XA2  |Ambulans2|AXL       
Pgk |2024-11-15|fre|10:15|PgkLabb     |D1.01|Alfa     |TOS       
Pgk |2024-11-15|fre|10:15|PgkLabb     |D1.02|Beta     |VIB       
Pgk |2024-11-15|fre|10:15|PgkLabb     |D1.03|Falk     |JOM       
Pgk |2024-11-15|fre|10:15|PgkLabb     |D1.04|Gamma    |EMS       
Pgk |2024-11-15|fre|10:15|PgkLabb     |D1.05|Hacke    |MAF       
Pgk |2024-11-15|fre|10:15|PgkLabb     |D1.06|Val      |ANP       
Pgk |2024-11-15|fre|10:15|PgkLabb     |D1.07|Varg     |NOA       
Pgk |2024-11-15|fre|10:15|PgkLabb     |XA1  |Ambulans1|EDN       
Pgk |2024-11-15|fre|10:15|PgkLabb     |XA2  |Ambulans2|HJR       
Pgk |2024-11-15|fre|10:15|PgkLabb     |XA3  |Ambulans3|NIM       
Pgk |2024-11-15|fre|10:15|PgkLabb     |XA4  |Ambulans4|SAR       
Pgk |2024-11-15|fre|13:15|PgkLabb     |D1.08|Alfa     |RUH       
Pgk |2024-11-15|fre|13:15|PgkLabb     |D1.09|Beta     |DAH       
Pgk |2024-11-15|fre|13:15|PgkLabb     |D1.10|Falk     |AXL       
Pgk |2024-11-15|fre|13:15|PgkLabb     |D1.11|Gamma    |ESS       
Pgk |2024-11-15|fre|13:15|PgkLabb     |D1.12|Hacke    |ADM       
Pgk |2024-11-15|fre|13:15|PgkLabb     |D1.13|Val      |VIB       
Pgk |2024-11-15|fre|13:15|PgkLabb     |D1.14|Varg     |MOG       
Pgk |2024-11-15|fre|13:15|PgkLabb     |XA1  |Ambulans1|ELÅ       
Pgk |2024-11-15|fre|13:15|PgkLabb     |XA2  |Ambulans2|HJR       
Pgk |2024-11-15|fre|13:15|PgkLabb     |XA3  |Ambulans3|SAH       
Pgk |2024-11-15|fre|13:15|PgkLabb     |XA4  |Ambulans4|SAR       
Pgk |2024-11-15|fre|15:15|PgkLabb     |C1.01|Falk     |NAK       
Pgk |2024-11-15|fre|15:15|PgkLabb     |C1.02|Jupiter  |HAE       
Pgk |2024-11-15|fre|15:15|PgkLabb     |C1.03|Mars     |JOE       
Pgk |2024-11-15|fre|15:15|PgkLabb     |C1.04|Saturnus |DAU       
Pgk |2024-11-15|fre|15:15|PgkLabb     |C1.05|Val      |MAU       
Pgk |2024-11-15|fre|15:15|PgkLabb     |C1.06|Varg     |SAH       
Pgk |2024-11-15|fre|15:15|PgkLabb     |XA1  |Ambulans1|SAR       
Pgk |2024-11-15|fre|15:15|PgkLabb     |XA2  |Ambulans2|HJR       
Pgk |2024-11-15|fre|15:15|PgkLabb     |XA3  |Ambulans3|OSK       
Pgk |2024-11-15|fre|15:15|PgkLabb     |XA4  |Ambulans4|VIB       
Pgk |2024-11-20|ons|13:15|PgkResurstid|D1.09|Alfa     |DAH       
Pgk |2024-11-20|ons|13:15|PgkResurstid|D1.10|Beta     |OSK       
Pgk |2024-11-20|ons|13:15|PgkResurstid|D1.11|Gamma    |ESS       
Pgk |2024-11-20|ons|13:15|PgkResurstid|XA1  |Ambulans1|VIB       
Pgk |2024-11-20|ons|13:15|PgkResurstid|XA2  |Ambulans2|HJR       
Pgk |2024-11-20|ons|15:15|PgkResurstid|D1.05|Alfa     |MAF       
Pgk |2024-11-20|ons|15:15|PgkResurstid|D1.06|Beta     |JOE       
Pgk |2024-11-20|ons|15:15|PgkResurstid|D1.07|Gamma    |???       
Pgk |2024-11-20|ons|15:15|PgkResurstid|D1.08|Varg     |RUH       
Pgk |2024-11-20|ons|15:15|PgkResurstid|XA1  |Ambulans1|ELÅ       
Pgk |2024-11-20|ons|15:15|PgkResurstid|XA2  |Ambulans2|NAK       
Pgk |2024-11-21|tor|08:15|PgkResurstid|C1.01|Falk     |NAK       
Pgk |2024-11-21|tor|08:15|PgkResurstid|C1.02|Hacke    |HAE       
Pgk |2024-11-21|tor|08:15|PgkResurstid|C1.03|Panter   |JOE       
Pgk |2024-11-21|tor|08:15|PgkResurstid|C1.04|Ravel    |DAU       
Pgk |2024-11-21|tor|08:15|PgkResurstid|C1.05|Val      |AXL       
Pgk |2024-11-21|tor|08:15|PgkResurstid|C1.06|Varg     |ADM       
Pgk |2024-11-21|tor|08:15|PgkResurstid|XA1  |Ambulans1|JON       
Pgk |2024-11-21|tor|08:15|PgkResurstid|XA2  |Ambulans2|HJR       
Pgk |2024-11-21|tor|13:15|PgkResurstid|D1.12|Alfa     |NIM       
Pgk |2024-11-21|tor|13:15|PgkResurstid|D1.13|Beta     |EDN       
Pgk |2024-11-21|tor|13:15|PgkResurstid|D1.14|Gamma    |MOG       
Pgk |2024-11-21|tor|13:15|PgkResurstid|XA1  |Ambulans1|SAH       
Pgk |2024-11-21|tor|13:15|PgkResurstid|XA2  |Ambulans2|DAU       
Pgk |2024-11-21|tor|13:15|PgkResurstid|XA3  |Ambulans3|ANP       
Pgk |2024-11-21|tor|15:15|PgkResurstid|D1.01|Alfa     |SAH       
Pgk |2024-11-21|tor|15:15|PgkResurstid|D1.02|Beta     |HJR       
Pgk |2024-11-21|tor|15:15|PgkResurstid|D1.03|Gamma    |JOM       
Pgk |2024-11-21|tor|15:15|PgkResurstid|D1.04|Varg     |EMS       
Pgk |2024-11-21|tor|15:15|PgkResurstid|XA1  |Ambulans1|AXL       
Pgk |2024-11-21|tor|15:15|PgkResurstid|XA2  |Ambulans2|NOA       
Pgk |2024-11-22|fre|10:15|PgkLabb     |D1.01|Alfa     |NIM       
Pgk |2024-11-22|fre|10:15|PgkLabb     |D1.02|Beta     |SAH       
Pgk |2024-11-22|fre|10:15|PgkLabb     |D1.03|Falk     |JOM       
Pgk |2024-11-22|fre|10:15|PgkLabb     |D1.04|Gamma    |EMS       
Pgk |2024-11-22|fre|10:15|PgkLabb     |D1.05|Hacke    |MAF       
Pgk |2024-11-22|fre|10:15|PgkLabb     |D1.06|Val      |ANP       
Pgk |2024-11-22|fre|10:15|PgkLabb     |D1.07|Varg     |TOS       
Pgk |2024-11-22|fre|10:15|PgkLabb     |XA1  |Ambulans1|MAU       
Pgk |2024-11-22|fre|10:15|PgkLabb     |XA2  |Ambulans2|SAR       
Pgk |2024-11-22|fre|10:15|PgkLabb     |XA3  |Ambulans3|TRF       
Pgk |2024-11-22|fre|10:15|PgkLabb     |XA4  |Ambulans4|DAU       
Pgk |2024-11-22|fre|13:15|PgkLabb     |D1.08|Alfa     |RUH       
Pgk |2024-11-22|fre|13:15|PgkLabb     |D1.09|Beta     |DAH       
Pgk |2024-11-22|fre|13:15|PgkLabb     |D1.10|Falk     |ANP       
Pgk |2024-11-22|fre|13:15|PgkLabb     |D1.11|Gamma    |ESS       
Pgk |2024-11-22|fre|13:15|PgkLabb     |D1.12|Hacke    |ADM       
Pgk |2024-11-22|fre|13:15|PgkLabb     |D1.13|Val      |AXL       
Pgk |2024-11-22|fre|13:15|PgkLabb     |D1.14|Varg     |NAK       
Pgk |2024-11-22|fre|13:15|PgkLabb     |XA1  |Ambulans1|ELÅ       
Pgk |2024-11-22|fre|13:15|PgkLabb     |XA2  |Ambulans2|HJR       
Pgk |2024-11-22|fre|13:15|PgkLabb     |XA3  |Ambulans3|VIB       
Pgk |2024-11-22|fre|13:15|PgkLabb     |XA4  |Ambulans4|MAU       
Pgk |2024-11-22|fre|15:15|PgkLabb     |C1.01|Falk     |NAK       
Pgk |2024-11-22|fre|15:15|PgkLabb     |C1.02|Jupiter  |AXL       
Pgk |2024-11-22|fre|15:15|PgkLabb     |C1.03|Mars     |JOE       
Pgk |2024-11-22|fre|15:15|PgkLabb     |C1.04|Saturnus |DAU       
Pgk |2024-11-22|fre|15:15|PgkLabb     |C1.05|Val      |MAU       
Pgk |2024-11-22|fre|15:15|PgkLabb     |C1.06|Varg     |OSK       
Pgk |2024-11-22|fre|15:15|PgkLabb     |XA1  |Ambulans1|ELÅ       
Pgk |2024-11-22|fre|15:15|PgkLabb     |XA2  |Ambulans2|ADM       
Pgk |2024-11-22|fre|15:15|PgkLabb     |XA3  |Ambulans3|ESS       
Pgk |2024-11-22|fre|15:15|PgkLabb     |XA4  |Ambulans4|VIB       
Pgk |2024-11-27|ons|13:15|PgkResurstid|D1.09|Alfa     |DAH       
Pgk |2024-11-27|ons|13:15|PgkResurstid|D1.10|Beta     |OSK       
Pgk |2024-11-27|ons|13:15|PgkResurstid|D1.11|Gamma    |ESS       
Pgk |2024-11-27|ons|13:15|PgkResurstid|XA1  |Ambulans1|TOS       
Pgk |2024-11-27|ons|13:15|PgkResurstid|XA2  |Ambulans2|JON       
Pgk |2024-11-27|ons|15:15|PgkResurstid|D1.05|Alfa     |MAF       
Pgk |2024-11-27|ons|15:15|PgkResurstid|D1.06|Beta     |ANP       
Pgk |2024-11-27|ons|15:15|PgkResurstid|D1.07|Gamma    |MAU       
Pgk |2024-11-27|ons|15:15|PgkResurstid|D1.08|Varg     |RUH       
Pgk |2024-11-27|ons|15:15|PgkResurstid|XA1  |Ambulans1|JON       
Pgk |2024-11-27|ons|15:15|PgkResurstid|XA2  |Ambulans2|NIM       
Pgk |2024-11-28|tor|08:15|PgkResurstid|C1.01|Falk     |NAK       
Pgk |2024-11-28|tor|08:15|PgkResurstid|C1.02|Hacke    |HAE       
Pgk |2024-11-28|tor|08:15|PgkResurstid|C1.03|Panter   |JOE       
Pgk |2024-11-28|tor|08:15|PgkResurstid|C1.04|Ravel    |DAU       
Pgk |2024-11-28|tor|08:15|PgkResurstid|C1.05|Val      |AXL       
Pgk |2024-11-28|tor|08:15|PgkResurstid|C1.06|Varg     |NIM       
Pgk |2024-11-28|tor|08:15|PgkResurstid|XA1  |Ambulans1|TOS       
Pgk |2024-11-28|tor|08:15|PgkResurstid|XA2  |Ambulans2|ANP       
Pgk |2024-11-28|tor|13:15|PgkResurstid|D1.12|Alfa     |ADM       
Pgk |2024-11-28|tor|13:15|PgkResurstid|D1.13|Beta     |EDN       
Pgk |2024-11-28|tor|13:15|PgkResurstid|D1.14|Gamma    |MOG       
Pgk |2024-11-28|tor|13:15|PgkResurstid|XA1  |Ambulans1|JON       
Pgk |2024-11-28|tor|13:15|PgkResurstid|XA2  |Ambulans2|SAH       
Pgk |2024-11-28|tor|13:15|PgkResurstid|XA3  |Ambulans3|TRF       
Pgk |2024-11-28|tor|15:15|PgkResurstid|D1.01|Alfa     |TRF       
Pgk |2024-11-28|tor|15:15|PgkResurstid|D1.02|Beta     |JON       
Pgk |2024-11-28|tor|15:15|PgkResurstid|D1.03|Gamma    |JOM       
Pgk |2024-11-28|tor|15:15|PgkResurstid|D1.04|Varg     |EMS       
Pgk |2024-11-28|tor|15:15|PgkResurstid|XA1  |Ambulans1|SAH       
Pgk |2024-11-28|tor|15:15|PgkResurstid|XA2  |Ambulans2|VIB       
Pgk |2024-11-29|fre|10:15|PgkLabb     |D1.01|Alfa     |VIB       
Pgk |2024-11-29|fre|10:15|PgkLabb     |D1.02|Beta     |???       
Pgk |2024-11-29|fre|10:15|PgkLabb     |D1.03|Falk     |JOM       
Pgk |2024-11-29|fre|10:15|PgkLabb     |D1.04|Gamma    |EMS       
Pgk |2024-11-29|fre|10:15|PgkLabb     |D1.05|Hacke    |MAF       
Pgk |2024-11-29|fre|10:15|PgkLabb     |D1.06|Val      |ANP       
Pgk |2024-11-29|fre|10:15|PgkLabb     |D1.07|Varg     |NOA       
Pgk |2024-11-29|fre|10:15|PgkLabb     |XA1  |Ambulans1|NIM       
Pgk |2024-11-29|fre|10:15|PgkLabb     |XA2  |Ambulans2|SAR       
Pgk |2024-11-29|fre|10:15|PgkLabb     |XA3  |Ambulans3|???       
Pgk |2024-11-29|fre|10:15|PgkLabb     |XA4  |Ambulans4|DAU       
Pgk |2024-11-29|fre|13:15|PgkLabb     |D1.08|Alfa     |RUH       
Pgk |2024-11-29|fre|13:15|PgkLabb     |D1.09|Beta     |DAH       
Pgk |2024-11-29|fre|13:15|PgkLabb     |D1.10|Falk     |HAE       
Pgk |2024-11-29|fre|13:15|PgkLabb     |D1.11|Gamma    |ESS       
Pgk |2024-11-29|fre|13:15|PgkLabb     |D1.12|Hacke    |ADM       
Pgk |2024-11-29|fre|13:15|PgkLabb     |D1.13|Val      |SAH       
Pgk |2024-11-29|fre|13:15|PgkLabb     |D1.14|Varg     |VIB       
Pgk |2024-11-29|fre|13:15|PgkLabb     |XA1  |Ambulans1|SAR       
Pgk |2024-11-29|fre|13:15|PgkLabb     |XA2  |Ambulans2|NAK       
Pgk |2024-11-29|fre|13:15|PgkLabb     |XA3  |Ambulans3|MAU       
Pgk |2024-11-29|fre|13:15|PgkLabb     |XA4  |Ambulans4|NOA       
Pgk |2024-11-29|fre|15:15|PgkLabb     |C1.01|Falk     |NAK       
Pgk |2024-11-29|fre|15:15|PgkLabb     |C1.02|Jupiter  |HAE       
Pgk |2024-11-29|fre|15:15|PgkLabb     |C1.03|Mars     |JOE       
Pgk |2024-11-29|fre|15:15|PgkLabb     |C1.04|Saturnus |DAU       
Pgk |2024-11-29|fre|15:15|PgkLabb     |C1.05|Val      |MAU       
Pgk |2024-11-29|fre|15:15|PgkLabb     |C1.06|Varg     |SAH       
Pgk |2024-11-29|fre|15:15|PgkLabb     |XA1  |Ambulans1|AXL       
Pgk |2024-11-29|fre|15:15|PgkLabb     |XA2  |Ambulans2|NOA       
Pgk |2024-11-29|fre|15:15|PgkLabb     |XA3  |Ambulans3|ESS       
Pgk |2024-11-29|fre|15:15|PgkLabb     |XA4  |Ambulans4|VIB       
Pgk |2024-12-04|ons|13:15|PgkResurstid|D1.09|Alfa     |DAH       
Pgk |2024-12-04|ons|13:15|PgkResurstid|D1.10|Beta     |OSK       
Pgk |2024-12-04|ons|13:15|PgkResurstid|D1.11|Gamma    |ESS       
Pgk |2024-12-04|ons|13:15|PgkResurstid|XA1  |Ambulans1|MAU       
Pgk |2024-12-04|ons|13:15|PgkResurstid|XA2  |Ambulans2|ANP       
Pgk |2024-12-04|ons|15:15|PgkResurstid|D1.05|Alfa     |MAF       
Pgk |2024-12-04|ons|15:15|PgkResurstid|D1.06|Beta     |ANP       
Pgk |2024-12-04|ons|15:15|PgkResurstid|D1.07|Gamma    |SAH       
Pgk |2024-12-04|ons|15:15|PgkResurstid|D1.08|Varg     |RUH       
Pgk |2024-12-04|ons|15:15|PgkResurstid|XA1  |Ambulans1|OSK       
Pgk |2024-12-04|ons|15:15|PgkResurstid|XA2  |Ambulans2|NAK       
Pgk |2024-12-05|tor|08:15|PgkResurstid|C1.01|Falk     |NAK       
Pgk |2024-12-05|tor|08:15|PgkResurstid|C1.02|Hacke    |HAE       
Pgk |2024-12-05|tor|08:15|PgkResurstid|C1.03|Panter   |JOE       
Pgk |2024-12-05|tor|08:15|PgkResurstid|C1.04|Ravel    |DAU       
Pgk |2024-12-05|tor|08:15|PgkResurstid|C1.05|Val      |TOS       
Pgk |2024-12-05|tor|08:15|PgkResurstid|C1.06|Varg     |NIM       
Pgk |2024-12-05|tor|08:15|PgkResurstid|XA1  |Ambulans1|AXL       
Pgk |2024-12-05|tor|08:15|PgkResurstid|XA2  |Ambulans2|RUH       
Pgk |2024-12-05|tor|13:15|PgkResurstid|D1.12|Alfa     |ADM       
Pgk |2024-12-05|tor|13:15|PgkResurstid|D1.13|Beta     |EDN       
Pgk |2024-12-05|tor|13:15|PgkResurstid|D1.14|Gamma    |MOG       
Pgk |2024-12-05|tor|13:15|PgkResurstid|XA1  |Ambulans1|VIB       
Pgk |2024-12-05|tor|13:15|PgkResurstid|XA2  |Ambulans2|RUH       
Pgk |2024-12-05|tor|13:15|PgkResurstid|XA3  |Ambulans3|TRF       
Pgk |2024-12-05|tor|15:15|PgkResurstid|D1.01|Alfa     |ELÅ       
Pgk |2024-12-05|tor|15:15|PgkResurstid|D1.02|Beta     |SAR       
Pgk |2024-12-05|tor|15:15|PgkResurstid|D1.03|Gamma    |JOM       
Pgk |2024-12-05|tor|15:15|PgkResurstid|D1.04|Varg     |EMS       
Pgk |2024-12-05|tor|15:15|PgkResurstid|XA1  |Ambulans1|JOE       
Pgk |2024-12-05|tor|15:15|PgkResurstid|XA2  |Ambulans2|HAE       
Pgk |2024-12-06|fre|10:15|PgkLabb     |D1.01|Alfa     |VIB       
Pgk |2024-12-06|fre|10:15|PgkLabb     |D1.02|Beta     |JON       
Pgk |2024-12-06|fre|10:15|PgkLabb     |D1.03|Falk     |JOM       
Pgk |2024-12-06|fre|10:15|PgkLabb     |D1.04|Gamma    |EMS       
Pgk |2024-12-06|fre|10:15|PgkLabb     |D1.05|Hacke    |MAF       
Pgk |2024-12-06|fre|10:15|PgkLabb     |D1.06|Val      |ANP       
Pgk |2024-12-06|fre|10:15|PgkLabb     |D1.07|Varg     |NOA       
Pgk |2024-12-06|fre|10:15|PgkLabb     |XA1  |Ambulans1|TOS       
Pgk |2024-12-06|fre|10:15|PgkLabb     |XA2  |Ambulans2|NIM       
Pgk |2024-12-06|fre|10:15|PgkLabb     |XA3  |Ambulans3|SAH       
Pgk |2024-12-06|fre|10:15|PgkLabb     |XA4  |Ambulans4|DAU       
Pgk |2024-12-06|fre|13:15|PgkLabb     |D1.08|Alfa     |RUH       
Pgk |2024-12-06|fre|13:15|PgkLabb     |D1.09|Beta     |DAH       
Pgk |2024-12-06|fre|13:15|PgkLabb     |D1.10|Falk     |AXL       
Pgk |2024-12-06|fre|13:15|PgkLabb     |D1.11|Gamma    |ESS       
Pgk |2024-12-06|fre|13:15|PgkLabb     |D1.12|Hacke    |ADM       
Pgk |2024-12-06|fre|13:15|PgkLabb     |D1.13|Val      |VIB       
Pgk |2024-12-06|fre|13:15|PgkLabb     |D1.14|Varg     |MOG       
Pgk |2024-12-06|fre|13:15|PgkLabb     |XA1  |Ambulans1|MAU       
Pgk |2024-12-06|fre|13:15|PgkLabb     |XA2  |Ambulans2|NAK       
Pgk |2024-12-06|fre|13:15|PgkLabb     |XA3  |Ambulans3|HJR       
Pgk |2024-12-06|fre|13:15|PgkLabb     |XA4  |Ambulans4|ANP       
Pgk |2024-12-06|fre|15:15|PgkLabb     |C1.01|Falk     |NAK       
Pgk |2024-12-06|fre|15:15|PgkLabb     |C1.02|Jupiter  |MOG       
Pgk |2024-12-06|fre|15:15|PgkLabb     |C1.03|Mars     |JOE       
Pgk |2024-12-06|fre|15:15|PgkLabb     |C1.04|Saturnus |DAU       
Pgk |2024-12-06|fre|15:15|PgkLabb     |C1.05|Val      |MAU       
Pgk |2024-12-06|fre|15:15|PgkLabb     |C1.06|Varg     |OSK       
Pgk |2024-12-06|fre|15:15|PgkLabb     |XA1  |Ambulans1|NOA       
Pgk |2024-12-06|fre|15:15|PgkLabb     |XA2  |Ambulans2|ESS       
Pgk |2024-12-06|fre|15:15|PgkLabb     |XA3  |Ambulans3|HJR       
Pgk |2024-12-06|fre|15:15|PgkLabb     |XA4  |Ambulans4|ANP       
Pgk |2024-12-11|ons|13:15|PgkResurstid|D1.09|Alfa     |DAH       
Pgk |2024-12-11|ons|13:15|PgkResurstid|D1.10|Beta     |OSK       
Pgk |2024-12-11|ons|13:15|PgkResurstid|D1.11|Gamma    |ESS       
Pgk |2024-12-11|ons|13:15|PgkResurstid|XA1  |Ambulans1|SAR       
Pgk |2024-12-11|ons|13:15|PgkResurstid|XA2  |Ambulans2|TOS       
Pgk |2024-12-11|ons|15:15|PgkResurstid|D1.05|Alfa     |MAF       
Pgk |2024-12-11|ons|15:15|PgkResurstid|D1.06|Beta     |ANP       
Pgk |2024-12-11|ons|15:15|PgkResurstid|D1.07|Gamma    |NOA       
Pgk |2024-12-11|ons|15:15|PgkResurstid|D1.08|Varg     |RUH       
Pgk |2024-12-11|ons|15:15|PgkResurstid|XA1  |Ambulans1|SAR       
Pgk |2024-12-11|ons|15:15|PgkResurstid|XA2  |Ambulans2|OSK       
Pgk |2024-12-12|tor|08:15|PgkResurstid|C1.01|Falk     |AXL       
Pgk |2024-12-12|tor|08:15|PgkResurstid|C1.02|Hacke    |HAE       
Pgk |2024-12-12|tor|08:15|PgkResurstid|C1.03|Panter   |JOE       
Pgk |2024-12-12|tor|08:15|PgkResurstid|C1.04|Ravel    |???       
Pgk |2024-12-12|tor|08:15|PgkResurstid|C1.05|Val      |TOS       
Pgk |2024-12-12|tor|08:15|PgkResurstid|C1.06|Varg     |NIM       
Pgk |2024-12-12|tor|08:15|PgkResurstid|XA1  |Ambulans1|RUH       
Pgk |2024-12-12|tor|08:15|PgkResurstid|XA2  |Ambulans2|ANP       
Pgk |2024-12-12|tor|13:15|PgkResurstid|D1.12|Alfa     |ADM       
Pgk |2024-12-12|tor|13:15|PgkResurstid|D1.13|Beta     |EDN       
Pgk |2024-12-12|tor|13:15|PgkResurstid|D1.14|Gamma    |MOG       
Pgk |2024-12-12|tor|13:15|PgkResurstid|XA1  |Ambulans1|NIM       
Pgk |2024-12-12|tor|13:15|PgkResurstid|XA2  |Ambulans2|NOA       
Pgk |2024-12-12|tor|13:15|PgkResurstid|XA3  |Ambulans3|TRF       
Pgk |2024-12-12|tor|15:15|PgkResurstid|D1.01|Alfa     |VIB       
Pgk |2024-12-12|tor|15:15|PgkResurstid|D1.02|Beta     |JON       
Pgk |2024-12-12|tor|15:15|PgkResurstid|D1.03|Gamma    |JOM       
Pgk |2024-12-12|tor|15:15|PgkResurstid|D1.04|Varg     |EMS       
Pgk |2024-12-12|tor|15:15|PgkResurstid|XA1  |Ambulans1|ELÅ       
Pgk |2024-12-12|tor|15:15|PgkResurstid|XA2  |Ambulans2|NOA       
Pgk |2024-12-13|fre|10:15|PgkLabb     |D1.01|Alfa     |VIB       
Pgk |2024-12-13|fre|10:15|PgkLabb     |D1.02|Beta     |JON       
Pgk |2024-12-13|fre|10:15|PgkLabb     |D1.03|Falk     |JOM       
Pgk |2024-12-13|fre|10:15|PgkLabb     |D1.04|Gamma    |EMS       
Pgk |2024-12-13|fre|10:15|PgkLabb     |D1.05|Hacke    |MAF       
Pgk |2024-12-13|fre|10:15|PgkLabb     |D1.06|Val      |ANP       
Pgk |2024-12-13|fre|10:15|PgkLabb     |D1.07|Varg     |TOS       
Pgk |2024-12-13|fre|10:15|PgkLabb     |XA1  |Ambulans1|NIM       
Pgk |2024-12-13|fre|10:15|PgkLabb     |XA2  |Ambulans2|DAH       
Pgk |2024-12-13|fre|13:15|PgkLabb     |D1.08|Alfa     |RUH       
Pgk |2024-12-13|fre|13:15|PgkLabb     |D1.09|Beta     |DAH       
Pgk |2024-12-13|fre|13:15|PgkLabb     |D1.10|Falk     |HAE       
Pgk |2024-12-13|fre|13:15|PgkLabb     |D1.11|Gamma    |ESS       
Pgk |2024-12-13|fre|13:15|PgkLabb     |D1.12|Hacke    |ADM       
Pgk |2024-12-13|fre|13:15|PgkLabb     |D1.13|Val      |AXL       
Pgk |2024-12-13|fre|13:15|PgkLabb     |D1.14|Varg     |MOG       
Pgk |2024-12-13|fre|13:15|PgkLabb     |XA1  |Ambulans1|NAK       
Pgk |2024-12-13|fre|13:15|PgkLabb     |XA2  |Ambulans2|VIB       
Pgk |2024-12-13|fre|13:15|PgkLabb     |XA3  |Ambulans3|MAU       
Pgk |2024-12-13|fre|13:15|PgkLabb     |XA4  |Ambulans4|HJR       
Pgk |2024-12-13|fre|15:15|PgkLabb     |C1.01|Falk     |NAK       
Pgk |2024-12-13|fre|15:15|PgkLabb     |C1.02|Jupiter  |HAE       
Pgk |2024-12-13|fre|15:15|PgkLabb     |C1.03|Mars     |JOE       
Pgk |2024-12-13|fre|15:15|PgkLabb     |C1.04|Saturnus |DAU       
Pgk |2024-12-13|fre|15:15|PgkLabb     |C1.05|Val      |MAU       
Pgk |2024-12-13|fre|15:15|PgkLabb     |C1.06|Varg     |NOA       
Pgk |2024-12-13|fre|15:15|PgkLabb     |XA1  |Ambulans1|OSK       
Pgk |2024-12-13|fre|15:15|PgkLabb     |XA2  |Ambulans2|ESS       
Pgk |2024-12-13|fre|15:15|PgkLabb     |XA3  |Ambulans3|AXL       
Pgk |2024-12-13|fre|15:15|PgkLabb     |XA4  |Ambulans4|ANP       
Pgk |2024-12-18|ons|13:15|PgkResurstid|D1.09|Alfa     |DAH       
Pgk |2024-12-18|ons|13:15|PgkResurstid|D1.10|Beta     |OSK       
Pgk |2024-12-18|ons|13:15|PgkResurstid|D1.11|Gamma    |ESS       
Pgk |2024-12-18|ons|13:15|PgkResurstid|XA1  |Ambulans1|MAU       
Pgk |2024-12-18|ons|13:15|PgkResurstid|XA2  |Ambulans2|SAR       
Pgk |2024-12-18|ons|15:15|PgkResurstid|D1.05|Alfa     |SAR       
Pgk |2024-12-18|ons|15:15|PgkResurstid|D1.06|Beta     |ANP       
Pgk |2024-12-18|ons|15:15|PgkResurstid|D1.07|Gamma    |NOA       
Pgk |2024-12-18|ons|15:15|PgkResurstid|D1.08|Varg     |RUH       
Pgk |2024-12-18|ons|15:15|PgkResurstid|XA1  |Ambulans1|MAU       
Pgk |2024-12-18|ons|15:15|PgkResurstid|XA2  |Ambulans2|VIB       
Pgk |2024-12-19|tor|08:15|PgkResurstid|C1.01|Falk     |NAK       
Pgk |2024-12-19|tor|08:15|PgkResurstid|C1.02|Hacke    |HAE       
Pgk |2024-12-19|tor|08:15|PgkResurstid|C1.03|Panter   |JOE       
Pgk |2024-12-19|tor|08:15|PgkResurstid|C1.04|Ravel    |DAU       
Pgk |2024-12-19|tor|08:15|PgkResurstid|C1.05|Val      |MAU       
Pgk |2024-12-19|tor|08:15|PgkResurstid|C1.06|Varg     |NIM       
Pgk |2024-12-19|tor|08:15|PgkResurstid|XA1  |Ambulans1|TOS       
Pgk |2024-12-19|tor|08:15|PgkResurstid|XA2  |Ambulans2|SAR       
Pgk |2024-12-19|tor|13:15|PgkResurstid|D1.12|Alfa     |ADM       
Pgk |2024-12-19|tor|13:15|PgkResurstid|D1.13|Beta     |EDN       
Pgk |2024-12-19|tor|13:15|PgkResurstid|D1.14|Gamma    |MOG       
Pgk |2024-12-19|tor|13:15|PgkResurstid|XA1  |Ambulans1|TOS       
Pgk |2024-12-19|tor|13:15|PgkResurstid|XA2  |Ambulans2|VIB       
Pgk |2024-12-19|tor|13:15|PgkResurstid|XA3  |Ambulans3|NOA       
Pgk |2024-12-19|tor|15:15|PgkResurstid|D1.01|Alfa     |TOS       
Pgk |2024-12-19|tor|15:15|PgkResurstid|D1.02|Beta     |NOA       
Pgk |2024-12-19|tor|15:15|PgkResurstid|D1.03|Gamma    |JOM       
Pgk |2024-12-19|tor|15:15|PgkResurstid|D1.04|Varg     |EMS       
Pgk |2024-12-19|tor|15:15|PgkResurstid|XA1  |Ambulans1|HAE       
Pgk |2024-12-19|tor|15:15|PgkResurstid|XA2  |Ambulans2|MAU       
""".trim.split('\n').toSeq