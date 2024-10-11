package kaptenallocweb
val dataGeneratedFromKaptenAlloc: Seq[String] = """
-----------------------------------------------------------------
kurs|datum     |dag|kl   |typ         |grupp|rum      |handledare
-----------------------------------------------------------------
Pgk |2024-09-04|ons|10:15|PgkResurstid|D1.01|Alfa     |ALW       
Pgk |2024-09-04|ons|10:15|PgkResurstid|D1.02|Beta     |ESS       
Pgk |2024-09-04|ons|10:15|PgkResurstid|D1.03|Gamma    |DAH       
Pgk |2024-09-04|ons|10:15|PgkResurstid|D1.04|Varg     |ANP       
Pgk |2024-09-04|ons|10:15|PgkResurstid|XA1  |Ambulans1|TOS       
Pgk |2024-09-04|ons|10:15|PgkResurstid|XA2  |Ambulans2|AXL       
Pgk |2024-09-04|ons|10:15|PgkResurstid|XA3  |Ambulans3|JON       
Pgk |2024-09-04|ons|13:15|PgkResurstid|D1.09|Alfa     |JOE       
Pgk |2024-09-04|ons|13:15|PgkResurstid|D1.10|Beta     |MOG       
Pgk |2024-09-04|ons|13:15|PgkResurstid|D1.11|Gamma    |NIM       
Pgk |2024-09-04|ons|13:15|PgkResurstid|XA1  |Ambulans1|TRF       
Pgk |2024-09-04|ons|13:15|PgkResurstid|XA2  |Ambulans2|AXL       
Pgk |2024-09-04|ons|15:15|PgkResurstid|D1.12|Alfa     |JOM       
Pgk |2024-09-04|ons|15:15|PgkResurstid|D1.13|Beta     |ELÅ       
Pgk |2024-09-04|ons|15:15|PgkResurstid|D1.14|Gamma    |VIB       
Pgk |2024-09-04|ons|15:15|PgkResurstid|XA1  |Ambulans1|TRF       
Pgk |2024-09-04|ons|15:15|PgkResurstid|XA2  |Ambulans2|AXL       
Dod |2024-09-04|ons|15:15|DodLabb     |D1.05|Falk     |MAF       
Dod |2024-09-04|ons|15:15|DodLabb     |D1.06|Val      |OSK       
Dod |2024-09-04|ons|15:15|DodLabb     |D1.07|Varg     |AXN       
Pgk |2024-09-05|tor|08:15|PgkResurstid|C1.01|Falk     |ELU       
Pgk |2024-09-05|tor|08:15|PgkResurstid|C1.02|Val      |EMS       
Pgk |2024-09-05|tor|08:15|PgkResurstid|C1.03|Varg     |NOA       
Pgk |2024-09-05|tor|08:15|PgkResurstid|XA1  |Ambulans1|TRF       
Pgk |2024-09-05|tor|08:15|PgkResurstid|XA2  |Ambulans2|HAE       
Dod |2024-09-05|tor|08:15|DodLabb     |D1.08|Alfa     |SAH       
Dod |2024-09-05|tor|08:15|DodLabb     |D1.09|Beta     |JOE       
Dod |2024-09-05|tor|08:15|DodLabb     |D1.10|Hacke    |MOG       
Dod |2024-09-05|tor|08:15|DodLabb     |D1.11|Panter   |TOS       
Pgk |2024-09-05|tor|13:15|PgkResurstid|D1.05|Alfa     |MAF       
Pgk |2024-09-05|tor|13:15|PgkResurstid|D1.06|Beta     |EDN       
Pgk |2024-09-05|tor|13:15|PgkResurstid|D1.07|Gamma    |AXN       
Pgk |2024-09-05|tor|13:15|PgkResurstid|D1.08|Varg     |SAH       
Pgk |2024-09-05|tor|13:15|PgkResurstid|XA1  |Ambulans1|VIB       
Pgk |2024-09-05|tor|13:15|PgkResurstid|XA2  |Ambulans2|AXL       
Pgk |2024-09-05|tor|13:15|PgkResurstid|XA3  |Ambulans3|JON       
Dod |2024-09-05|tor|13:15|DodLabb     |D1.01|Falk     |JOE       
Dod |2024-09-05|tor|13:15|DodLabb     |D1.02|Hacke    |ESS       
Dod |2024-09-05|tor|13:15|DodLabb     |D1.03|Panter   |ELÅ       
Dod |2024-09-05|tor|13:15|DodLabb     |D1.04|Val      |ANP       
Pgk |2024-09-05|tor|15:15|PgkResurstid|C1.04|Falk     |KAS       
Pgk |2024-09-05|tor|15:15|PgkResurstid|C1.05|Val      |RUH       
Pgk |2024-09-05|tor|15:15|PgkResurstid|C1.06|Varg     |NAK       
Pgk |2024-09-05|tor|15:15|PgkResurstid|XA1  |Ambulans1|TRF       
Pgk |2024-09-05|tor|15:15|PgkResurstid|XA2  |Ambulans2|AXL       
Dod |2024-09-05|tor|15:15|DodLabb     |C1.01|Jupiter  |JON       
Dod |2024-09-05|tor|15:15|DodLabb     |C1.02|Mars     |EMS       
Dod |2024-09-05|tor|15:15|DodLabb     |C1.03|Saturnus |MAU       
Pgk |2024-09-06|fre|10:15|PgkLabb     |D1.01|Alfa     |ALW       
Pgk |2024-09-06|fre|10:15|PgkLabb     |D1.02|Beta     |ESS       
Pgk |2024-09-06|fre|10:15|PgkLabb     |D1.03|Falk     |DAH       
Pgk |2024-09-06|fre|10:15|PgkLabb     |D1.04|Gamma    |ELU       
Pgk |2024-09-06|fre|10:15|PgkLabb     |D1.05|Hacke    |MAF       
Pgk |2024-09-06|fre|10:15|PgkLabb     |D1.06|Val      |MAU       
Pgk |2024-09-06|fre|10:15|PgkLabb     |D1.07|Varg     |NIK       
Pgk |2024-09-06|fre|10:15|PgkLabb     |XA1  |Ambulans1|TRF       
Pgk |2024-09-06|fre|10:15|PgkLabb     |XA2  |Ambulans2|AXL       
Pgk |2024-09-06|fre|10:15|PgkLabb     |XA3  |Ambulans3|JON       
Pgk |2024-09-06|fre|10:15|PgkLabb     |XA4  |Ambulans4|KAS       
Dod |2024-09-06|fre|10:15|DodLabb     |D1.12|Jupiter  |JOM       
Dod |2024-09-06|fre|10:15|DodLabb     |D1.13|Mars     |JOE       
Dod |2024-09-06|fre|10:15|DodLabb     |D1.14|Saturnus |VIB       
Pgk |2024-09-06|fre|13:15|PgkLabb     |D1.08|Alfa     |SAH       
Pgk |2024-09-06|fre|13:15|PgkLabb     |D1.09|Beta     |ALW       
Pgk |2024-09-06|fre|13:15|PgkLabb     |D1.10|Falk     |MOG       
Pgk |2024-09-06|fre|13:15|PgkLabb     |D1.11|Gamma    |TOS       
Pgk |2024-09-06|fre|13:15|PgkLabb     |D1.12|Hacke    |JOM       
Pgk |2024-09-06|fre|13:15|PgkLabb     |D1.13|Val      |ELÅ       
Pgk |2024-09-06|fre|13:15|PgkLabb     |D1.14|Varg     |VIB       
Pgk |2024-09-06|fre|13:15|PgkLabb     |XA1  |Ambulans1|TRF       
Pgk |2024-09-06|fre|13:15|PgkLabb     |XA2  |Ambulans2|AXL       
Pgk |2024-09-06|fre|13:15|PgkLabb     |XA3  |Ambulans3|DAU       
Pgk |2024-09-06|fre|13:15|PgkLabb     |XA4  |Ambulans4|NAK       
Dod |2024-09-06|fre|13:15|DodLabb     |C1.04|Jupiter  |ADM       
Dod |2024-09-06|fre|13:15|DodLabb     |C1.05|Mars     |RUH       
Dod |2024-09-06|fre|13:15|DodLabb     |C1.06|Saturnus |OSK       
Pgk |2024-09-06|fre|15:15|PgkLabb     |C1.01|Falk     |ELU       
Pgk |2024-09-06|fre|15:15|PgkLabb     |C1.02|Jupiter  |EMS       
Pgk |2024-09-06|fre|15:15|PgkLabb     |C1.03|Mars     |NOA       
Pgk |2024-09-06|fre|15:15|PgkLabb     |C1.04|Saturnus |ADM       
Pgk |2024-09-06|fre|15:15|PgkLabb     |C1.05|Val      |RUH       
Pgk |2024-09-06|fre|15:15|PgkLabb     |C1.06|Varg     |OSK       
Pgk |2024-09-06|fre|15:15|PgkLabb     |XA1  |Ambulans1|TRF       
Pgk |2024-09-06|fre|15:15|PgkLabb     |XA2  |Ambulans2|AXL       
Pgk |2024-09-06|fre|15:15|PgkLabb     |XA3  |Ambulans3|LOL       
Pgk |2024-09-06|fre|15:15|PgkLabb     |XA4  |Ambulans4|NAK       
Pgk |2024-09-11|ons|10:15|PgkResurstid|D1.01|Alfa     |ALW       
Pgk |2024-09-11|ons|10:15|PgkResurstid|D1.02|Beta     |ESS       
Pgk |2024-09-11|ons|10:15|PgkResurstid|D1.03|Gamma    |DAH       
Pgk |2024-09-11|ons|10:15|PgkResurstid|D1.04|Varg     |ANP       
Pgk |2024-09-11|ons|10:15|PgkResurstid|XA1  |Ambulans1|TRF       
Pgk |2024-09-11|ons|10:15|PgkResurstid|XA2  |Ambulans2|AXL       
Pgk |2024-09-11|ons|10:15|PgkResurstid|XA3  |Ambulans3|JON       
Pgk |2024-09-11|ons|13:15|PgkResurstid|D1.09|Alfa     |JOE       
Pgk |2024-09-11|ons|13:15|PgkResurstid|D1.10|Beta     |MOG       
Pgk |2024-09-11|ons|13:15|PgkResurstid|D1.11|Gamma    |TOS       
Pgk |2024-09-11|ons|13:15|PgkResurstid|XA1  |Ambulans1|TRF       
Pgk |2024-09-11|ons|13:15|PgkResurstid|XA2  |Ambulans2|AXL       
Pgk |2024-09-11|ons|15:15|PgkResurstid|D1.12|Alfa     |JOM       
Pgk |2024-09-11|ons|15:15|PgkResurstid|D1.13|Beta     |ELÅ       
Pgk |2024-09-11|ons|15:15|PgkResurstid|D1.14|Gamma    |VIB       
Pgk |2024-09-11|ons|15:15|PgkResurstid|XA1  |Ambulans1|TRF       
Pgk |2024-09-11|ons|15:15|PgkResurstid|XA2  |Ambulans2|AXL       
Dod |2024-09-11|ons|15:15|DodLabb     |D1.05|Falk     |OSK       
Dod |2024-09-11|ons|15:15|DodLabb     |D1.06|Val      |MAN       
Dod |2024-09-11|ons|15:15|DodLabb     |D1.07|Varg     |ALW       
Pgk |2024-09-12|tor|08:15|PgkResurstid|C1.01|Falk     |ANP       
Pgk |2024-09-12|tor|08:15|PgkResurstid|C1.02|Val      |EMS       
Pgk |2024-09-12|tor|08:15|PgkResurstid|C1.03|Varg     |DAU       
Pgk |2024-09-12|tor|08:15|PgkResurstid|XA1  |Ambulans1|SAR       
Pgk |2024-09-12|tor|08:15|PgkResurstid|XA2  |Ambulans2|HAE       
Dod |2024-09-12|tor|08:15|DodLabb     |D1.08|Alfa     |MAU       
Dod |2024-09-12|tor|08:15|DodLabb     |D1.09|Beta     |VIB       
Dod |2024-09-12|tor|08:15|DodLabb     |D1.10|Hacke    |HJR       
Dod |2024-09-12|tor|08:15|DodLabb     |D1.11|Panter   |SAH       
Pgk |2024-09-12|tor|13:15|PgkResurstid|D1.05|Alfa     |MAF       
Pgk |2024-09-12|tor|13:15|PgkResurstid|D1.06|Beta     |EDN       
Pgk |2024-09-12|tor|13:15|PgkResurstid|D1.07|Gamma    |AXN       
Pgk |2024-09-12|tor|13:15|PgkResurstid|D1.08|Varg     |SAH       
Pgk |2024-09-12|tor|13:15|PgkResurstid|XA1  |Ambulans1|NAK       
Pgk |2024-09-12|tor|13:15|PgkResurstid|XA2  |Ambulans2|SAR       
Pgk |2024-09-12|tor|13:15|PgkResurstid|XA3  |Ambulans3|JON       
Dod |2024-09-12|tor|13:15|DodLabb     |D1.01|Falk     |JOE       
Dod |2024-09-12|tor|13:15|DodLabb     |D1.02|Hacke    |RUH       
Dod |2024-09-12|tor|13:15|DodLabb     |D1.03|Panter   |VIB       
Dod |2024-09-12|tor|13:15|DodLabb     |D1.04|Val      |OSK       
Pgk |2024-09-12|tor|15:15|PgkResurstid|C1.04|Falk     |KAS       
Pgk |2024-09-12|tor|15:15|PgkResurstid|C1.05|Val      |AXL       
Pgk |2024-09-12|tor|15:15|PgkResurstid|C1.06|Varg     |HJR       
Pgk |2024-09-12|tor|15:15|PgkResurstid|XA1  |Ambulans1|HAE       
Pgk |2024-09-12|tor|15:15|PgkResurstid|XA2  |Ambulans2|MAF       
Dod |2024-09-12|tor|15:15|DodLabb     |C1.01|Jupiter  |MAU       
Dod |2024-09-12|tor|15:15|DodLabb     |C1.02|Mars     |VIB       
Dod |2024-09-12|tor|15:15|DodLabb     |C1.03|Saturnus |ANP       
Dod |2024-09-13|fre|10:15|DodLabb     |D1.12|Jupiter  |ELÅ       
Dod |2024-09-13|fre|10:15|DodLabb     |D1.13|Mars     |VIB       
Dod |2024-09-13|fre|10:15|DodLabb     |D1.14|Saturnus |LOL       
Dod |2024-09-13|fre|13:15|DodLabb     |C1.04|Jupiter  |VIB       
Dod |2024-09-13|fre|13:15|DodLabb     |C1.05|Mars     |LOL       
Dod |2024-09-13|fre|13:15|DodLabb     |C1.06|Saturnus |SAR       
Pgk |2024-09-18|ons|10:15|PgkResurstid|D1.01|Alfa     |ALW       
Pgk |2024-09-18|ons|10:15|PgkResurstid|D1.02|Beta     |ESS       
Pgk |2024-09-18|ons|10:15|PgkResurstid|D1.03|Gamma    |DAH       
Pgk |2024-09-18|ons|10:15|PgkResurstid|D1.04|Varg     |ANP       
Pgk |2024-09-18|ons|10:15|PgkResurstid|XA1  |Ambulans1|HJR       
Pgk |2024-09-18|ons|10:15|PgkResurstid|XA2  |Ambulans2|NIM       
Pgk |2024-09-18|ons|10:15|PgkResurstid|XA3  |Ambulans3|JON       
Pgk |2024-09-18|ons|13:15|PgkResurstid|D1.09|Alfa     |JOE       
Pgk |2024-09-18|ons|13:15|PgkResurstid|D1.10|Beta     |MOG       
Pgk |2024-09-18|ons|13:15|PgkResurstid|D1.11|Gamma    |TOS       
Pgk |2024-09-18|ons|13:15|PgkResurstid|XA1  |Ambulans1|SAR       
Pgk |2024-09-18|ons|13:15|PgkResurstid|XA2  |Ambulans2|NAK       
Pgk |2024-09-18|ons|15:15|PgkResurstid|D1.12|Alfa     |JOM       
Pgk |2024-09-18|ons|15:15|PgkResurstid|D1.13|Beta     |ELÅ       
Pgk |2024-09-18|ons|15:15|PgkResurstid|D1.14|Gamma    |VIB       
Pgk |2024-09-18|ons|15:15|PgkResurstid|XA1  |Ambulans1|NOA       
Pgk |2024-09-18|ons|15:15|PgkResurstid|XA2  |Ambulans2|SAR       
Dod |2024-09-18|ons|15:15|DodLabb     |D1.05|Falk     |OSK       
Dod |2024-09-18|ons|15:15|DodLabb     |D1.06|Val      |ELU       
Dod |2024-09-18|ons|15:15|DodLabb     |D1.07|Varg     |SAH       
Pgk |2024-09-19|tor|08:15|PgkResurstid|C1.01|Falk     |ELU       
Pgk |2024-09-19|tor|08:15|PgkResurstid|C1.02|Val      |EMS       
Pgk |2024-09-19|tor|08:15|PgkResurstid|C1.03|Varg     |AXL       
Pgk |2024-09-19|tor|08:15|PgkResurstid|XA1  |Ambulans1|RUH       
Pgk |2024-09-19|tor|08:15|PgkResurstid|XA2  |Ambulans2|SAR       
Dod |2024-09-19|tor|08:15|DodLabb     |D1.08|Alfa     |JOE       
Dod |2024-09-19|tor|08:15|DodLabb     |D1.09|Beta     |DAU       
Dod |2024-09-19|tor|08:15|DodLabb     |D1.10|Hacke    |ESS       
Dod |2024-09-19|tor|08:15|DodLabb     |D1.11|Panter   |ANP       
Pgk |2024-09-19|tor|13:15|PgkResurstid|D1.05|Alfa     |MAF       
Pgk |2024-09-19|tor|13:15|PgkResurstid|D1.06|Beta     |EDN       
Pgk |2024-09-19|tor|13:15|PgkResurstid|D1.07|Gamma    |AXN       
Pgk |2024-09-19|tor|13:15|PgkResurstid|D1.08|Varg     |SAH       
Pgk |2024-09-19|tor|13:15|PgkResurstid|XA1  |Ambulans1|NOA       
Pgk |2024-09-19|tor|13:15|PgkResurstid|XA2  |Ambulans2|OSK       
Pgk |2024-09-19|tor|13:15|PgkResurstid|XA3  |Ambulans3|MOG       
Dod |2024-09-19|tor|13:15|DodLabb     |D1.01|Falk     |VIB       
Dod |2024-09-19|tor|13:15|DodLabb     |D1.02|Hacke    |NAK       
Dod |2024-09-19|tor|13:15|DodLabb     |D1.03|Panter   |JOE       
Dod |2024-09-19|tor|13:15|DodLabb     |D1.04|Val      |ESS       
Pgk |2024-09-19|tor|15:15|PgkResurstid|C1.04|Falk     |ADM       
Pgk |2024-09-19|tor|15:15|PgkResurstid|C1.05|Val      |RUH       
Pgk |2024-09-19|tor|15:15|PgkResurstid|C1.06|Varg     |OSK       
Pgk |2024-09-19|tor|15:15|PgkResurstid|XA1  |Ambulans1|KAS       
Pgk |2024-09-19|tor|15:15|PgkResurstid|XA2  |Ambulans2|LOL       
Dod |2024-09-19|tor|15:15|DodLabb     |C1.01|Jupiter  |MAU       
Dod |2024-09-19|tor|15:15|DodLabb     |C1.02|Mars     |VIB       
Dod |2024-09-19|tor|15:15|DodLabb     |C1.03|Saturnus |ANP       
Pgk |2024-09-20|fre|10:15|PgkLabb     |D1.01|Alfa     |ALW       
Pgk |2024-09-20|fre|10:15|PgkLabb     |D1.02|Beta     |ESS       
Pgk |2024-09-20|fre|10:15|PgkLabb     |D1.03|Falk     |DAH       
Pgk |2024-09-20|fre|10:15|PgkLabb     |D1.04|Gamma    |ANP       
Pgk |2024-09-20|fre|10:15|PgkLabb     |D1.05|Hacke    |MAF       
Pgk |2024-09-20|fre|10:15|PgkLabb     |D1.06|Val      |NIM       
Pgk |2024-09-20|fre|10:15|PgkLabb     |D1.07|Varg     |AXN       
Pgk |2024-09-20|fre|10:15|PgkLabb     |XA1  |Ambulans1|TRF       
Pgk |2024-09-20|fre|10:15|PgkLabb     |XA2  |Ambulans2|AXL       
Pgk |2024-09-20|fre|10:15|PgkLabb     |XA3  |Ambulans3|HJR       
Pgk |2024-09-20|fre|10:15|PgkLabb     |XA4  |Ambulans4|LOL       
Dod |2024-09-20|fre|10:15|DodLabb     |D1.12|Jupiter  |ELU       
Dod |2024-09-20|fre|10:15|DodLabb     |D1.13|Mars     |MAU       
Dod |2024-09-20|fre|10:15|DodLabb     |D1.14|Saturnus |TOS       
Pgk |2024-09-20|fre|13:15|PgkLabb     |D1.08|Alfa     |SAH       
Pgk |2024-09-20|fre|13:15|PgkLabb     |D1.09|Beta     |KAS       
Pgk |2024-09-20|fre|13:15|PgkLabb     |D1.10|Falk     |MOG       
Pgk |2024-09-20|fre|13:15|PgkLabb     |D1.11|Gamma    |TOS       
Pgk |2024-09-20|fre|13:15|PgkLabb     |D1.12|Hacke    |JOM       
Pgk |2024-09-20|fre|13:15|PgkLabb     |D1.13|Val      |ELÅ       
Pgk |2024-09-20|fre|13:15|PgkLabb     |D1.14|Varg     |VIB       
Pgk |2024-09-20|fre|13:15|PgkLabb     |XA1  |Ambulans1|TRF       
Pgk |2024-09-20|fre|13:15|PgkLabb     |XA2  |Ambulans2|AXL       
Pgk |2024-09-20|fre|13:15|PgkLabb     |XA3  |Ambulans3|NIM       
Pgk |2024-09-20|fre|13:15|PgkLabb     |XA4  |Ambulans4|NAK       
Dod |2024-09-20|fre|13:15|DodLabb     |C1.04|Jupiter  |LOL       
Dod |2024-09-20|fre|13:15|DodLabb     |C1.05|Mars     |HJR       
Dod |2024-09-20|fre|13:15|DodLabb     |C1.06|Saturnus |ANP       
Pgk |2024-09-20|fre|15:15|PgkLabb     |C1.01|Falk     |ELU       
Pgk |2024-09-20|fre|15:15|PgkLabb     |C1.02|Jupiter  |EMS       
Pgk |2024-09-20|fre|15:15|PgkLabb     |C1.03|Mars     |NOA       
Pgk |2024-09-20|fre|15:15|PgkLabb     |C1.04|Saturnus |ADM       
Pgk |2024-09-20|fre|15:15|PgkLabb     |C1.05|Val      |RUH       
Pgk |2024-09-20|fre|15:15|PgkLabb     |C1.06|Varg     |OSK       
Pgk |2024-09-20|fre|15:15|PgkLabb     |XA1  |Ambulans1|TRF       
Pgk |2024-09-20|fre|15:15|PgkLabb     |XA2  |Ambulans2|NIM       
Pgk |2024-09-20|fre|15:15|PgkLabb     |XA3  |Ambulans3|JOE       
Pgk |2024-09-20|fre|15:15|PgkLabb     |XA4  |Ambulans4|NAK       
Pgk |2024-09-25|ons|10:15|PgkResurstid|D1.01|Alfa     |RUH       
Pgk |2024-09-25|ons|10:15|PgkResurstid|D1.02|Beta     |ESS       
Pgk |2024-09-25|ons|10:15|PgkResurstid|D1.03|Gamma    |DAH       
Pgk |2024-09-25|ons|10:15|PgkResurstid|D1.04|Varg     |ANP       
Pgk |2024-09-25|ons|10:15|PgkResurstid|XA1  |Ambulans1|OSK       
Pgk |2024-09-25|ons|10:15|PgkResurstid|XA2  |Ambulans2|NIM       
Pgk |2024-09-25|ons|10:15|PgkResurstid|XA3  |Ambulans3|JON       
Pgk |2024-09-25|ons|13:15|PgkResurstid|D1.09|Alfa     |SAR       
Pgk |2024-09-25|ons|13:15|PgkResurstid|D1.10|Beta     |MOG       
Pgk |2024-09-25|ons|13:15|PgkResurstid|D1.11|Gamma    |TOS       
Pgk |2024-09-25|ons|13:15|PgkResurstid|XA1  |Ambulans1|NIM       
Pgk |2024-09-25|ons|13:15|PgkResurstid|XA2  |Ambulans2|KAS       
Pgk |2024-09-25|ons|15:15|PgkResurstid|D1.12|Alfa     |JOM       
Pgk |2024-09-25|ons|15:15|PgkResurstid|D1.13|Beta     |ELÅ       
Pgk |2024-09-25|ons|15:15|PgkResurstid|D1.14|Gamma    |MOG       
Pgk |2024-09-25|ons|15:15|PgkResurstid|XA1  |Ambulans1|KAS       
Pgk |2024-09-25|ons|15:15|PgkResurstid|XA2  |Ambulans2|HAE       
Dod |2024-09-25|ons|15:15|DodLabb     |D1.05|Falk     |OSK       
Dod |2024-09-25|ons|15:15|DodLabb     |D1.06|Val      |AXN       
Dod |2024-09-25|ons|15:15|DodLabb     |D1.07|Varg     |ELU       
Pgk |2024-09-26|tor|08:15|PgkResurstid|C1.01|Falk     |ELU       
Pgk |2024-09-26|tor|08:15|PgkResurstid|C1.02|Val      |EMS       
Pgk |2024-09-26|tor|08:15|PgkResurstid|C1.03|Varg     |DAU       
Pgk |2024-09-26|tor|08:15|PgkResurstid|XA1  |Ambulans1|SAR       
Pgk |2024-09-26|tor|08:15|PgkResurstid|XA2  |Ambulans2|KAS       
Dod |2024-09-26|tor|08:15|DodLabb     |D1.08|Alfa     |VIB       
Dod |2024-09-26|tor|08:15|DodLabb     |D1.09|Beta     |TRF       
Dod |2024-09-26|tor|08:15|DodLabb     |D1.10|Hacke    |ANP       
Dod |2024-09-26|tor|08:15|DodLabb     |D1.11|Panter   |LOL       
Pgk |2024-09-26|tor|13:15|PgkResurstid|D1.05|Alfa     |MAF       
Pgk |2024-09-26|tor|13:15|PgkResurstid|D1.06|Beta     |EDN       
Pgk |2024-09-26|tor|13:15|PgkResurstid|D1.07|Gamma    |AXN       
Pgk |2024-09-26|tor|13:15|PgkResurstid|D1.08|Varg     |SAH       
Pgk |2024-09-26|tor|13:15|PgkResurstid|XA1  |Ambulans1|NIK       
Pgk |2024-09-26|tor|13:15|PgkResurstid|XA2  |Ambulans2|DAU       
Pgk |2024-09-26|tor|13:15|PgkResurstid|XA3  |Ambulans3|JON       
Dod |2024-09-26|tor|13:15|DodLabb     |D1.01|Falk     |MAU       
Dod |2024-09-26|tor|13:15|DodLabb     |D1.02|Hacke    |VIB       
Dod |2024-09-26|tor|13:15|DodLabb     |D1.03|Panter   |ANP       
Dod |2024-09-26|tor|13:15|DodLabb     |D1.04|Val      |NIM       
Pgk |2024-09-26|tor|15:15|PgkResurstid|C1.04|Falk     |ADM       
Pgk |2024-09-26|tor|15:15|PgkResurstid|C1.05|Val      |RUH       
Pgk |2024-09-26|tor|15:15|PgkResurstid|C1.06|Varg     |OSK       
Pgk |2024-09-26|tor|15:15|PgkResurstid|XA1  |Ambulans1|NIK       
Pgk |2024-09-26|tor|15:15|PgkResurstid|XA2  |Ambulans2|NOA       
Dod |2024-09-26|tor|15:15|DodLabb     |C1.01|Jupiter  |LOL       
Dod |2024-09-26|tor|15:15|DodLabb     |C1.02|Mars     |MAU       
Dod |2024-09-26|tor|15:15|DodLabb     |C1.03|Saturnus |HAE       
Pgk |2024-09-27|fre|10:15|PgkLabb     |D1.01|Alfa     |ALW       
Pgk |2024-09-27|fre|10:15|PgkLabb     |D1.02|Beta     |RUH       
Pgk |2024-09-27|fre|10:15|PgkLabb     |D1.03|Falk     |DAH       
Pgk |2024-09-27|fre|10:15|PgkLabb     |D1.04|Gamma    |HJR       
Pgk |2024-09-27|fre|10:15|PgkLabb     |D1.05|Hacke    |MAF       
Pgk |2024-09-27|fre|10:15|PgkLabb     |D1.06|Val      |EDN       
Pgk |2024-09-27|fre|10:15|PgkLabb     |D1.07|Varg     |AXN       
Pgk |2024-09-27|fre|10:15|PgkLabb     |XA1  |Ambulans1|DAU       
Pgk |2024-09-27|fre|10:15|PgkLabb     |XA2  |Ambulans2|AXL       
Pgk |2024-09-27|fre|10:15|PgkLabb     |XA3  |Ambulans3|JON       
Pgk |2024-09-27|fre|10:15|PgkLabb     |XA4  |Ambulans4|NOA       
Dod |2024-09-27|fre|10:15|DodLabb     |D1.12|Jupiter  |VIB       
Dod |2024-09-27|fre|10:15|DodLabb     |D1.13|Mars     |MAU       
Dod |2024-09-27|fre|10:15|DodLabb     |D1.14|Saturnus |ELU       
Pgk |2024-09-27|fre|13:15|PgkLabb     |D1.08|Alfa     |SAH       
Pgk |2024-09-27|fre|13:15|PgkLabb     |D1.09|Beta     |DAU       
Pgk |2024-09-27|fre|13:15|PgkLabb     |D1.10|Falk     |HJR       
Pgk |2024-09-27|fre|13:15|PgkLabb     |D1.11|Gamma    |KAS       
Pgk |2024-09-27|fre|13:15|PgkLabb     |D1.12|Hacke    |JOM       
Pgk |2024-09-27|fre|13:15|PgkLabb     |D1.13|Val      |ELÅ       
Pgk |2024-09-27|fre|13:15|PgkLabb     |D1.14|Varg     |VIB       
Pgk |2024-09-27|fre|13:15|PgkLabb     |XA1  |Ambulans1|NIK       
Pgk |2024-09-27|fre|13:15|PgkLabb     |XA2  |Ambulans2|ESS       
Pgk |2024-09-27|fre|13:15|PgkLabb     |XA3  |Ambulans3|NIM       
Pgk |2024-09-27|fre|13:15|PgkLabb     |XA4  |Ambulans4|NOA       
Dod |2024-09-27|fre|13:15|DodLabb     |C1.04|Jupiter  |LOL       
Dod |2024-09-27|fre|13:15|DodLabb     |C1.05|Mars     |MAF       
Dod |2024-09-27|fre|13:15|DodLabb     |C1.06|Saturnus |ELU       
Pgk |2024-09-27|fre|15:15|PgkLabb     |C1.01|Falk     |JOE       
Pgk |2024-09-27|fre|15:15|PgkLabb     |C1.02|Jupiter  |EMS       
Pgk |2024-09-27|fre|15:15|PgkLabb     |C1.03|Mars     |NOA       
Pgk |2024-09-27|fre|15:15|PgkLabb     |C1.04|Saturnus |ADM       
Pgk |2024-09-27|fre|15:15|PgkLabb     |C1.05|Val      |RUH       
Pgk |2024-09-27|fre|15:15|PgkLabb     |C1.06|Varg     |OSK       
Pgk |2024-09-27|fre|15:15|PgkLabb     |XA1  |Ambulans1|LOL       
Pgk |2024-09-27|fre|15:15|PgkLabb     |XA2  |Ambulans2|HAE       
Pgk |2024-09-27|fre|15:15|PgkLabb     |XA3  |Ambulans3|NIK       
Pgk |2024-09-27|fre|15:15|PgkLabb     |XA4  |Ambulans4|HJR       
Pgk |2024-10-02|ons|10:15|PgkResurstid|D1.01|Alfa     |ALW       
Pgk |2024-10-02|ons|10:15|PgkResurstid|D1.02|Beta     |ESS       
Pgk |2024-10-02|ons|10:15|PgkResurstid|D1.03|Gamma    |DAH       
Pgk |2024-10-02|ons|10:15|PgkResurstid|D1.04|Varg     |ANP       
Pgk |2024-10-02|ons|10:15|PgkResurstid|XA1  |Ambulans1|NOA       
Pgk |2024-10-02|ons|10:15|PgkResurstid|XA2  |Ambulans2|NIM       
Pgk |2024-10-02|ons|10:15|PgkResurstid|XA3  |Ambulans3|HJR       
Pgk |2024-10-02|ons|13:15|PgkResurstid|D1.09|Alfa     |NIM       
Pgk |2024-10-02|ons|13:15|PgkResurstid|D1.10|Beta     |MOG       
Pgk |2024-10-02|ons|13:15|PgkResurstid|D1.11|Gamma    |TOS       
Pgk |2024-10-02|ons|13:15|PgkResurstid|XA1  |Ambulans1|DAU       
Pgk |2024-10-02|ons|13:15|PgkResurstid|XA2  |Ambulans2|VIB       
Pgk |2024-10-02|ons|15:15|PgkResurstid|D1.12|Alfa     |JOM       
Pgk |2024-10-02|ons|15:15|PgkResurstid|D1.13|Beta     |ELÅ       
Pgk |2024-10-02|ons|15:15|PgkResurstid|D1.14|Gamma    |VIB       
Pgk |2024-10-02|ons|15:15|PgkResurstid|XA1  |Ambulans1|LOL       
Pgk |2024-10-02|ons|15:15|PgkResurstid|XA2  |Ambulans2|HJR       
Pgk |2024-10-03|tor|08:15|PgkResurstid|C1.01|Falk     |ELU       
Pgk |2024-10-03|tor|08:15|PgkResurstid|C1.02|Val      |EMS       
Pgk |2024-10-03|tor|08:15|PgkResurstid|C1.03|Varg     |HJR       
Pgk |2024-10-03|tor|08:15|PgkResurstid|XA1  |Ambulans1|AXN       
Pgk |2024-10-03|tor|08:15|PgkResurstid|XA2  |Ambulans2|NAK       
Pgk |2024-10-03|tor|13:15|PgkResurstid|D1.05|Alfa     |MAF       
Pgk |2024-10-03|tor|13:15|PgkResurstid|D1.06|Beta     |ADM       
Pgk |2024-10-03|tor|13:15|PgkResurstid|D1.07|Gamma    |AXN       
Pgk |2024-10-03|tor|13:15|PgkResurstid|D1.08|Varg     |SAH       
Pgk |2024-10-03|tor|13:15|PgkResurstid|XA1  |Ambulans1|ANP       
Pgk |2024-10-03|tor|13:15|PgkResurstid|XA2  |Ambulans2|JOE       
Pgk |2024-10-03|tor|13:15|PgkResurstid|XA3  |Ambulans3|OSK       
Pgk |2024-10-03|tor|15:15|PgkResurstid|C1.04|Falk     |ADM       
Pgk |2024-10-03|tor|15:15|PgkResurstid|C1.05|Val      |RUH       
Pgk |2024-10-03|tor|15:15|PgkResurstid|C1.06|Varg     |MAF       
Pgk |2024-10-03|tor|15:15|PgkResurstid|XA1  |Ambulans1|NOA       
Pgk |2024-10-03|tor|15:15|PgkResurstid|XA2  |Ambulans2|LOL       
Pgk |2024-10-04|fre|10:15|PgkLabb     |D1.01|Alfa     |ALW       
Pgk |2024-10-04|fre|10:15|PgkLabb     |D1.02|Beta     |ESS       
Pgk |2024-10-04|fre|10:15|PgkLabb     |D1.03|Falk     |DAH       
Pgk |2024-10-04|fre|10:15|PgkLabb     |D1.04|Gamma    |ANP       
Pgk |2024-10-04|fre|10:15|PgkLabb     |D1.05|Hacke    |MAF       
Pgk |2024-10-04|fre|10:15|PgkLabb     |D1.06|Val      |LOL       
Pgk |2024-10-04|fre|10:15|PgkLabb     |D1.07|Varg     |AXN       
Pgk |2024-10-04|fre|10:15|PgkLabb     |XA1  |Ambulans1|HAE       
Pgk |2024-10-04|fre|10:15|PgkLabb     |XA2  |Ambulans2|NIM       
Pgk |2024-10-04|fre|10:15|PgkLabb     |XA3  |Ambulans3|RUH       
Pgk |2024-10-04|fre|10:15|PgkLabb     |XA4  |Ambulans4|NOA       
Pgk |2024-10-04|fre|13:15|PgkLabb     |D1.08|Alfa     |SAH       
Pgk |2024-10-04|fre|13:15|PgkLabb     |D1.09|Beta     |JOE       
Pgk |2024-10-04|fre|13:15|PgkLabb     |D1.10|Falk     |MOG       
Pgk |2024-10-04|fre|13:15|PgkLabb     |D1.11|Gamma    |TOS       
Pgk |2024-10-04|fre|13:15|PgkLabb     |D1.12|Hacke    |JOM       
Pgk |2024-10-04|fre|13:15|PgkLabb     |D1.13|Val      |ELÅ       
Pgk |2024-10-04|fre|13:15|PgkLabb     |D1.14|Varg     |VIB       
Pgk |2024-10-04|fre|13:15|PgkLabb     |XA1  |Ambulans1|ELU       
Pgk |2024-10-04|fre|13:15|PgkLabb     |XA2  |Ambulans2|DAU       
Pgk |2024-10-04|fre|13:15|PgkLabb     |XA3  |Ambulans3|HJR       
Pgk |2024-10-04|fre|13:15|PgkLabb     |XA4  |Ambulans4|ESS       
Pgk |2024-10-04|fre|15:15|PgkLabb     |C1.01|Falk     |ELU       
Pgk |2024-10-04|fre|15:15|PgkLabb     |C1.02|Jupiter  |EMS       
Pgk |2024-10-04|fre|15:15|PgkLabb     |C1.03|Mars     |NOA       
Pgk |2024-10-04|fre|15:15|PgkLabb     |C1.04|Saturnus |ADM       
Pgk |2024-10-04|fre|15:15|PgkLabb     |C1.05|Val      |RUH       
Pgk |2024-10-04|fre|15:15|PgkLabb     |C1.06|Varg     |OSK       
Pgk |2024-10-04|fre|15:15|PgkLabb     |XA1  |Ambulans1|KAS       
Pgk |2024-10-04|fre|15:15|PgkLabb     |XA2  |Ambulans2|SAR       
Pgk |2024-10-04|fre|15:15|PgkLabb     |XA3  |Ambulans3|HJR       
Pgk |2024-10-04|fre|15:15|PgkLabb     |XA4  |Ambulans4|HAE       
Pgk |2024-10-09|ons|10:15|PgkResurstid|D1.01|Alfa     |ALW       
Pgk |2024-10-09|ons|10:15|PgkResurstid|D1.02|Beta     |ESS       
Pgk |2024-10-09|ons|10:15|PgkResurstid|D1.03|Gamma    |DAH       
Pgk |2024-10-09|ons|10:15|PgkResurstid|D1.04|Varg     |ANP       
Pgk |2024-10-09|ons|10:15|PgkResurstid|XA1  |Ambulans1|HAE       
Pgk |2024-10-09|ons|10:15|PgkResurstid|XA2  |Ambulans2|NIK       
Pgk |2024-10-09|ons|10:15|PgkResurstid|XA3  |Ambulans3|KAS       
Pgk |2024-10-09|ons|13:15|PgkResurstid|D1.09|Alfa     |ELU       
Pgk |2024-10-09|ons|13:15|PgkResurstid|D1.10|Beta     |MOG       
Pgk |2024-10-09|ons|13:15|PgkResurstid|D1.11|Gamma    |TOS       
Pgk |2024-10-09|ons|13:15|PgkResurstid|XA1  |Ambulans1|LOL       
Pgk |2024-10-09|ons|13:15|PgkResurstid|XA2  |Ambulans2|NIK       
Pgk |2024-10-09|ons|15:15|PgkResurstid|D1.12|Alfa     |JOM       
Pgk |2024-10-09|ons|15:15|PgkResurstid|D1.13|Beta     |ELÅ       
Pgk |2024-10-09|ons|15:15|PgkResurstid|D1.14|Gamma    |MOG       
Pgk |2024-10-09|ons|15:15|PgkResurstid|XA1  |Ambulans1|HAE       
Pgk |2024-10-09|ons|15:15|PgkResurstid|XA2  |Ambulans |VIB       
Pgk |2024-10-10|tor|08:15|PgkResurstid|C1.01|Falk     |ELU       
Pgk |2024-10-10|tor|08:15|PgkResurstid|C1.02|Val      |EMS       
Pgk |2024-10-10|tor|08:15|PgkResurstid|C1.03|Varg     |RUH       
Pgk |2024-10-10|tor|08:15|PgkResurstid|XA1  |Ambulans1|DAU       
Pgk |2024-10-10|tor|08:15|PgkResurstid|XA2  |Ambulans2|NAK       
Pgk |2024-10-10|tor|13:15|PgkResurstid|D1.05|Alfa     |MAF       
Pgk |2024-10-10|tor|13:15|PgkResurstid|D1.06|Beta     |ADM       
Pgk |2024-10-10|tor|13:15|PgkResurstid|D1.07|Gamma    |DAU       
Pgk |2024-10-10|tor|13:15|PgkResurstid|D1.08|Varg     |SAH       
Pgk |2024-10-10|tor|13:15|PgkResurstid|XA1  |Ambulans1|NIK       
Pgk |2024-10-10|tor|13:15|PgkResurstid|XA2  |Ambulans2|ESS       
Pgk |2024-10-10|tor|13:15|PgkResurstid|XA3  |Ambulans3|LOL       
Pgk |2024-10-10|tor|15:15|PgkResurstid|C1.04|Falk     |ADM       
Pgk |2024-10-10|tor|15:15|PgkResurstid|C1.05|Val      |RUH       
Pgk |2024-10-10|tor|15:15|PgkResurstid|C1.06|Varg     |OSK       
Pgk |2024-10-10|tor|15:15|PgkResurstid|XA1  |Ambulans1|HAE       
Pgk |2024-10-10|tor|15:15|PgkResurstid|XA2  |Ambulans2|ANP       
Pgk |2024-10-11|fre|10:15|PgkLabb     |D1.01|Alfa     |ALW       
Pgk |2024-10-11|fre|10:15|PgkLabb     |D1.02|Beta     |ESS       
Pgk |2024-10-11|fre|10:15|PgkLabb     |D1.03|Falk     |DAH       
Pgk |2024-10-11|fre|10:15|PgkLabb     |D1.04|Gamma    |ANP       
Pgk |2024-10-11|fre|10:15|PgkLabb     |D1.05|Hacke    |RUH       
Pgk |2024-10-11|fre|10:15|PgkLabb     |D1.06|Val      |EDN       
Pgk |2024-10-11|fre|10:15|PgkLabb     |D1.07|Varg     |AXN       
Pgk |2024-10-11|fre|10:15|PgkLabb     |XA1  |Ambulans1|HAE       
Pgk |2024-10-11|fre|10:15|PgkLabb     |XA2  |Ambulans2|NIK       
Pgk |2024-10-11|fre|10:15|PgkLabb     |XA3  |Ambulans3|JON       
Pgk |2024-10-11|fre|10:15|PgkLabb     |XA4  |Ambulans4|VIB       
Pgk |2024-10-11|fre|13:15|PgkLabb     |D1.08|Alfa     |SAH       
Pgk |2024-10-11|fre|13:15|PgkLabb     |D1.09|Beta     |EDN       
Pgk |2024-10-11|fre|13:15|PgkLabb     |D1.10|Falk     |NAK       
Pgk |2024-10-11|fre|13:15|PgkLabb     |D1.11|Gamma    |TOS       
Pgk |2024-10-11|fre|13:15|PgkLabb     |D1.12|Hacke    |JOM       
Pgk |2024-10-11|fre|13:15|PgkLabb     |D1.13|Val      |ELÅ       
Pgk |2024-10-11|fre|13:15|PgkLabb     |D1.14|Varg     |VIB       
Pgk |2024-10-11|fre|13:15|PgkLabb     |XA1  |Ambulans1|HJR       
Pgk |2024-10-11|fre|13:15|PgkLabb     |XA2  |Ambulans2|HAE       
Pgk |2024-10-11|fre|13:15|PgkLabb     |XA3  |Ambulans3|NIM       
Pgk |2024-10-11|fre|13:15|PgkLabb     |XA4  |Ambulans4|ANP       
Pgk |2024-10-11|fre|15:15|PgkLabb     |C1.01|Falk     |TRF       
Pgk |2024-10-11|fre|15:15|PgkLabb     |C1.02|Jupiter  |EMS       
Pgk |2024-10-11|fre|15:15|PgkLabb     |C1.03|Mars     |NOA       
Pgk |2024-10-11|fre|15:15|PgkLabb     |C1.04|Saturnus |ADM       
Pgk |2024-10-11|fre|15:15|PgkLabb     |C1.05|Val      |RUH       
Pgk |2024-10-11|fre|15:15|PgkLabb     |C1.06|Varg     |OSK       
Pgk |2024-10-11|fre|15:15|PgkLabb     |XA1  |Ambulans1|HJR       
Pgk |2024-10-11|fre|15:15|PgkLabb     |XA2  |Ambulans2|SAR       
Pgk |2024-10-11|fre|15:15|PgkLabb     |XA3  |Ambulans3|VIB       
Pgk |2024-10-11|fre|15:15|PgkLabb     |XA4  |Ambulans4|NIK       
Pgk |2024-10-16|ons|10:15|PgkResurstid|D1.01|Alfa     |ALW       
Pgk |2024-10-16|ons|10:15|PgkResurstid|D1.02|Beta     |ESS       
Pgk |2024-10-16|ons|10:15|PgkResurstid|D1.03|Gamma    |DAH       
Pgk |2024-10-16|ons|10:15|PgkResurstid|D1.04|Varg     |ANP       
Pgk |2024-10-16|ons|10:15|PgkResurstid|XA1  |Ambulans1|ELU       
Pgk |2024-10-16|ons|10:15|PgkResurstid|XA2  |Ambulans2|DAU       
Pgk |2024-10-16|ons|10:15|PgkResurstid|XA3  |Ambulans3|LOL       
Pgk |2024-10-16|ons|13:15|PgkResurstid|D1.09|Alfa     |JOE       
Pgk |2024-10-16|ons|13:15|PgkResurstid|D1.10|Beta     |MOG       
Pgk |2024-10-16|ons|13:15|PgkResurstid|D1.11|Gamma    |TOS       
Pgk |2024-10-16|ons|13:15|PgkResurstid|XA1  |Ambulans1|NOA       
Pgk |2024-10-16|ons|13:15|PgkResurstid|XA2  |Ambulans2|DAU       
Pgk |2024-10-16|ons|15:15|PgkResurstid|D1.12|Alfa     |JOM       
Pgk |2024-10-16|ons|15:15|PgkResurstid|D1.13|Beta     |ELÅ       
Pgk |2024-10-16|ons|15:15|PgkResurstid|D1.14|Gamma    |SAR       
Pgk |2024-10-16|ons|15:15|PgkResurstid|XA1  |Ambulans1|DAU       
Pgk |2024-10-16|ons|15:15|PgkResurstid|XA2  |Ambulans2|JOE       
Pgk |2024-10-17|tor|08:15|PgkResurstid|C1.01|Falk     |ELU       
Pgk |2024-10-17|tor|08:15|PgkResurstid|C1.02|Val      |EMS       
Pgk |2024-10-17|tor|08:15|PgkResurstid|C1.03|Varg     |SAR       
Pgk |2024-10-17|tor|08:15|PgkResurstid|XA1  |Ambulans1|LOL       
Pgk |2024-10-17|tor|08:15|PgkResurstid|XA2  |Ambulans2|NAK       
Pgk |2024-10-17|tor|13:15|PgkResurstid|D1.05|Alfa     |MAF       
Pgk |2024-10-17|tor|13:15|PgkResurstid|D1.06|Beta     |DAH       
Pgk |2024-10-17|tor|13:15|PgkResurstid|D1.07|Gamma    |AXN       
Pgk |2024-10-17|tor|13:15|PgkResurstid|D1.08|Varg     |SAH       
Pgk |2024-10-17|tor|13:15|PgkResurstid|XA1  |Ambulans1|NIK       
Pgk |2024-10-17|tor|13:15|PgkResurstid|XA2  |Ambulans2|TOS       
Pgk |2024-10-17|tor|13:15|PgkResurstid|XA3  |Ambulans3|OSK       
Pgk |2024-10-17|tor|15:15|PgkResurstid|C1.04|Falk     |ADM       
Pgk |2024-10-17|tor|15:15|PgkResurstid|C1.05|Val      |RUH       
Pgk |2024-10-17|tor|15:15|PgkResurstid|C1.06|Varg     |OSK       
Pgk |2024-10-17|tor|15:15|PgkResurstid|XA1  |Ambulans1|NIK       
Pgk |2024-10-17|tor|15:15|PgkResurstid|XA2  |Ambulans2|EDN       
Pgk |2024-10-18|fre|10:15|PgkLabb     |D1.01|Alfa     |ALW       
Pgk |2024-10-18|fre|10:15|PgkLabb     |D1.02|Beta     |ESS       
Pgk |2024-10-18|fre|10:15|PgkLabb     |D1.03|Falk     |DAH       
Pgk |2024-10-18|fre|10:15|PgkLabb     |D1.04|Gamma    |ANP       
Pgk |2024-10-18|fre|10:15|PgkLabb     |D1.05|Hacke    |MAF       
Pgk |2024-10-18|fre|10:15|PgkLabb     |D1.06|Val      |NOA       
Pgk |2024-10-18|fre|10:15|PgkLabb     |D1.07|Varg     |AXN       
Pgk |2024-10-18|fre|10:15|PgkLabb     |XA1  |Ambulans1|NIM       
Pgk |2024-10-18|fre|10:15|PgkLabb     |XA2  |Ambulans2|HAE       
Pgk |2024-10-18|fre|10:15|PgkLabb     |XA3  |Ambulans3|KAS       
Pgk |2024-10-18|fre|10:15|PgkLabb     |XA4  |Ambulans4|LOL       
Pgk |2024-10-18|fre|13:15|PgkLabb     |D1.08|Alfa     |SAH       
Pgk |2024-10-18|fre|13:15|PgkLabb     |D1.09|Beta     |JOE       
Pgk |2024-10-18|fre|13:15|PgkLabb     |D1.10|Falk     |NIK       
Pgk |2024-10-18|fre|13:15|PgkLabb     |D1.11|Gamma    |TOS       
Pgk |2024-10-18|fre|13:15|PgkLabb     |D1.12|Hacke    |JOM       
Pgk |2024-10-18|fre|13:15|PgkLabb     |D1.13|Val      |ELÅ       
Pgk |2024-10-18|fre|13:15|PgkLabb     |D1.14|Varg     |VIB       
Pgk |2024-10-18|fre|13:15|PgkLabb     |XA1  |Ambulans1|HJR       
Pgk |2024-10-18|fre|13:15|PgkLabb     |XA2  |Ambulans2|NIM       
Pgk |2024-10-18|fre|13:15|PgkLabb     |XA3  |Ambulans3|ESS       
Pgk |2024-10-18|fre|13:15|PgkLabb     |XA4  |Ambulans4|ANP       
Pgk |2024-10-18|fre|15:15|PgkLabb     |C1.01|Falk     |LOL       
Pgk |2024-10-18|fre|15:15|PgkLabb     |C1.02|Jupiter  |EMS       
Pgk |2024-10-18|fre|15:15|PgkLabb     |C1.03|Mars     |NOA       
Pgk |2024-10-18|fre|15:15|PgkLabb     |C1.04|Saturnus |ADM       
Pgk |2024-10-18|fre|15:15|PgkLabb     |C1.05|Val      |RUH       
Pgk |2024-10-18|fre|15:15|PgkLabb     |C1.06|Varg     |OSK       
Pgk |2024-10-18|fre|15:15|PgkLabb     |XA1  |Ambulans1|JOE       
Pgk |2024-10-18|fre|15:15|PgkLabb     |XA2  |Ambulans2|VIB       
Pgk |2024-10-18|fre|15:15|PgkLabb     |XA3  |Ambulans3|NIK       
Pgk |2024-10-18|fre|15:15|PgkLabb     |XA4  |Ambulans4|KAS       
""".trim.split('\n').toSeq