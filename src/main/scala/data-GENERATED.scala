package kaptenallocweb
val dataGeneratedFromKaptenAlloc: Seq[String] = """
-----------------------------------------------------------------
kurs|datum     |dag|kl   |typ         |grupp|rum      |handledare
-----------------------------------------------------------------
Pgk |2023-08-30|ons|10:15|PgkResurstid|D1.01|Alfa     |AN        
Pgk |2023-08-30|ons|10:15|PgkResurstid|D1.02|Beta     |JE        
Pgk |2023-08-30|ons|10:15|PgkResurstid|D1.03|Gamma    |JM        
Pgk |2023-08-30|ons|10:15|PgkResurstid|XA1  |Ambulans1|LB        
Pgk |2023-08-30|ons|10:15|PgkResurstid|XA2  |Ambulans2|EN        
Pgk |2023-08-30|ons|13:15|PgkResurstid|D1.07|Alfa     |JC        
Pgk |2023-08-30|ons|13:15|PgkResurstid|D1.08|Beta     |HP        
Pgk |2023-08-30|ons|13:15|PgkResurstid|D1.09|Gamma    |OB        
Pgk |2023-08-30|ons|13:15|PgkResurstid|XA1  |Ambulans1|LB        
Pgk |2023-08-30|ons|13:15|PgkResurstid|XA2  |Ambulans2|EN        
Pgk |2023-08-30|ons|15:15|PgkResurstid|D1.10|Alfa     |DH        
Pgk |2023-08-30|ons|15:15|PgkResurstid|D1.11|Beta     |PS        
Pgk |2023-08-30|ons|15:15|PgkResurstid|D1.12|Gamma    |HL        
Pgk |2023-08-30|ons|15:15|PgkResurstid|XA1  |Ambulans1|LB        
Pgk |2023-08-30|ons|15:15|PgkResurstid|XA2  |Ambulans2|EN        
Pgk |2023-08-31|tor|10:15|PgkResurstid|D1.04|Alfa     |JH        
Pgk |2023-08-31|tor|10:15|PgkResurstid|D1.05|Beta     |LL        
Pgk |2023-08-31|tor|10:15|PgkResurstid|D1.06|Gamma    |TL        
Pgk |2023-08-31|tor|10:15|PgkResurstid|XA1  |Ambulans1|FA        
Pgk |2023-08-31|tor|10:15|PgkResurstid|XA2  |Ambulans2|EN        
Dod |2023-08-31|tor|10:15|DodLabb     |D1.07|Jupiter  |JC        
Dod |2023-08-31|tor|10:15|DodLabb     |D1.08|Mars     |AW        
Dod |2023-08-31|tor|10:15|DodLabb     |D1.09|Saturnus |OB        
Pgk |2023-08-31|tor|13:15|PgkResurstid|C1.01|Falk     |AP        
Pgk |2023-08-31|tor|13:15|PgkResurstid|C1.02|Val      |HT        
Pgk |2023-08-31|tor|13:15|PgkResurstid|C1.03|Varg     |VB        
Pgk |2023-08-31|tor|13:15|PgkResurstid|XA1  |Ambulans1|LB        
Pgk |2023-08-31|tor|13:15|PgkResurstid|XA2  |Ambulans2|HX        
Dod |2023-08-31|tor|13:15|DodLabb     |C1.04|Beta     |TF        
Dod |2023-08-31|tor|13:15|DodLabb     |C1.05|Gamma    |AM        
Dod |2023-08-31|tor|13:15|DodLabb     |C1.06|Lo       |JC        
Dod |2023-08-31|tor|13:15|DodLabb     |D1.01|Elg      |AN        
Dod |2023-08-31|tor|13:15|DodLabb     |D1.02|Hacke    |MN        
Dod |2023-08-31|tor|13:15|DodLabb     |D1.03|Panter   |OK        
Pgk |2023-08-31|tor|15:15|PgkResurstid|C1.04|Falk     |TF        
Pgk |2023-08-31|tor|15:15|PgkResurstid|C1.05|Val      |ES        
Pgk |2023-08-31|tor|15:15|PgkResurstid|C1.06|Varg     |NA        
Pgk |2023-08-31|tor|15:15|PgkResurstid|XA1  |Ambulans1|LB        
Pgk |2023-08-31|tor|15:15|PgkResurstid|XA2  |Ambulans2|EN        
Dod |2023-08-31|tor|15:15|DodLabb     |C1.01|Jupiter  |AP        
Dod |2023-08-31|tor|15:15|DodLabb     |C1.02|Mars     |FA        
Dod |2023-08-31|tor|15:15|DodLabb     |C1.03|Saturnus |VB        
Pgk |2023-09-01|fre|10:15|PgkLabb     |D1.01|Alfa     |AN        
Pgk |2023-09-01|fre|10:15|PgkLabb     |D1.02|Beta     |LL        
Pgk |2023-09-01|fre|10:15|PgkLabb     |D1.03|Gamma    |OK        
Pgk |2023-09-01|fre|10:15|PgkLabb     |D1.04|Hacke    |JH        
Pgk |2023-09-01|fre|10:15|PgkLabb     |D1.05|Val      |JE        
Pgk |2023-09-01|fre|10:15|PgkLabb     |D1.06|Varg     |TL        
Pgk |2023-09-01|fre|10:15|PgkLabb     |XA1  |Ambulans1|LB        
Pgk |2023-09-01|fre|10:15|PgkLabb     |XA2  |Ambulans2|EN        
Pgk |2023-09-01|fre|10:15|PgkLabb     |XA3  |Ambulans3|HX        
Dod |2023-09-01|fre|10:15|DodLabb     |D1.10|Jupiter  |DH        
Dod |2023-09-01|fre|10:15|DodLabb     |D1.11|Mars     |VB        
Dod |2023-09-01|fre|10:15|DodLabb     |D1.12|Saturnus |MG        
Pgk |2023-09-01|fre|13:15|PgkLabb     |D1.07|Alfa     |JC        
Pgk |2023-09-01|fre|13:15|PgkLabb     |D1.08|Beta     |HP        
Pgk |2023-09-01|fre|13:15|PgkLabb     |D1.09|Falk     |OB        
Pgk |2023-09-01|fre|13:15|PgkLabb     |D1.10|Gamma    |DH        
Pgk |2023-09-01|fre|13:15|PgkLabb     |D1.11|Val      |PS        
Pgk |2023-09-01|fre|13:15|PgkLabb     |D1.12|Varg     |HL        
Pgk |2023-09-01|fre|13:15|PgkLabb     |XA1  |Ambulans1|LB        
Pgk |2023-09-01|fre|13:15|PgkLabb     |XA2  |Ambulans2|EN        
Pgk |2023-09-01|fre|13:15|PgkLabb     |XA3  |Ambulans3|HX        
Pgk |2023-09-01|fre|15:15|PgkLabb     |C1.01|Falk     |AP        
Pgk |2023-09-01|fre|15:15|PgkLabb     |C1.02|Jupiter  |FA        
Pgk |2023-09-01|fre|15:15|PgkLabb     |C1.03|Mars     |VB        
Pgk |2023-09-01|fre|15:15|PgkLabb     |C1.04|Saturnus |TF        
Pgk |2023-09-01|fre|15:15|PgkLabb     |C1.05|Val      |ES        
Pgk |2023-09-01|fre|15:15|PgkLabb     |C1.06|Varg     |NA        
Pgk |2023-09-01|fre|15:15|PgkLabb     |XA1  |Ambulans1|LB        
Pgk |2023-09-01|fre|15:15|PgkLabb     |XA2  |Ambulans2|AM        
Pgk |2023-09-01|fre|15:15|PgkLabb     |XA3  |Ambulans3|HX        
Dod |2023-09-01|fre|15:15|DodLabb     |D1.04|Alfa     |JC        
Dod |2023-09-01|fre|15:15|DodLabb     |D1.05|Beta     |MG        
Dod |2023-09-01|fre|15:15|DodLabb     |D1.06|Gamma    |JM        
Pgk |2023-09-06|ons|10:15|PgkResurstid|D1.01|Alfa     |AN        
Pgk |2023-09-06|ons|10:15|PgkResurstid|D1.02|Beta     |LL        
Pgk |2023-09-06|ons|10:15|PgkResurstid|D1.03|Gamma    |AW        
Pgk |2023-09-06|ons|10:15|PgkResurstid|XA1  |Ambulans1|LB        
Pgk |2023-09-06|ons|10:15|PgkResurstid|XA2  |Ambulans2|EN        
Pgk |2023-09-06|ons|13:15|PgkResurstid|D1.07|Alfa     |JC        
Pgk |2023-09-06|ons|13:15|PgkResurstid|D1.08|Beta     |HP        
Pgk |2023-09-06|ons|13:15|PgkResurstid|D1.09|Gamma    |OB        
Pgk |2023-09-06|ons|13:15|PgkResurstid|XA1  |Ambulans1|LB        
Pgk |2023-09-06|ons|13:15|PgkResurstid|XA2  |Ambulans2|HX        
Pgk |2023-09-06|ons|15:15|PgkResurstid|D1.10|Alfa     |DH        
Pgk |2023-09-06|ons|15:15|PgkResurstid|D1.11|Beta     |PS        
Pgk |2023-09-06|ons|15:15|PgkResurstid|D1.12|Gamma    |HL        
Pgk |2023-09-06|ons|15:15|PgkResurstid|XA1  |Ambulans1|LB        
Pgk |2023-09-06|ons|15:15|PgkResurstid|XA2  |Ambulans2|EN        
Pgk |2023-09-07|tor|10:15|PgkResurstid|D1.04|Alfa     |JH        
Pgk |2023-09-07|tor|10:15|PgkResurstid|D1.05|Beta     |HX        
Pgk |2023-09-07|tor|10:15|PgkResurstid|D1.06|Gamma    |TL        
Pgk |2023-09-07|tor|10:15|PgkResurstid|XA1  |Ambulans1|HT        
Pgk |2023-09-07|tor|10:15|PgkResurstid|XA2  |Ambulans2|EN        
Dod |2023-09-07|tor|10:15|DodLabb     |D1.07|Jupiter  |JC        
Dod |2023-09-07|tor|10:15|DodLabb     |D1.08|Mars     |FA        
Dod |2023-09-07|tor|10:15|DodLabb     |D1.09|Saturnus |OB        
Pgk |2023-09-07|tor|13:15|PgkResurstid|C1.01|Falk     |AP        
Pgk |2023-09-07|tor|13:15|PgkResurstid|C1.02|Val      |AM        
Pgk |2023-09-07|tor|13:15|PgkResurstid|C1.03|Varg     |VB        
Pgk |2023-09-07|tor|13:15|PgkResurstid|XA1  |Ambulans1|PS        
Pgk |2023-09-07|tor|13:15|PgkResurstid|XA2  |Ambulans2|JC        
Dod |2023-09-07|tor|13:15|DodLabb     |C1.04|Beta     |TF        
Dod |2023-09-07|tor|13:15|DodLabb     |C1.05|Gamma    |ES        
Dod |2023-09-07|tor|13:15|DodLabb     |C1.06|Lo       |OB        
Dod |2023-09-07|tor|13:15|DodLabb     |D1.01|Elg      |AN        
Dod |2023-09-07|tor|13:15|DodLabb     |D1.02|Hacke    |LB        
Dod |2023-09-07|tor|13:15|DodLabb     |D1.03|Panter   |OK        
Pgk |2023-09-07|tor|15:15|PgkResurstid|C1.04|Falk     |TF        
Pgk |2023-09-07|tor|15:15|PgkResurstid|C1.05|Val      |ES        
Pgk |2023-09-07|tor|15:15|PgkResurstid|C1.06|Varg     |NA        
Pgk |2023-09-07|tor|15:15|PgkResurstid|XA1  |Ambulans1|AÅ        
Pgk |2023-09-07|tor|15:15|PgkResurstid|XA2  |Ambulans2|AW        
Dod |2023-09-07|tor|15:15|DodLabb     |C1.01|Jupiter  |AP        
Dod |2023-09-07|tor|15:15|DodLabb     |C1.02|Mars     |FA        
Dod |2023-09-07|tor|15:15|DodLabb     |C1.03|Saturnus |VB        
Dod |2023-09-08|fre|10:15|DodLabb     |D1.10|Jupiter  |DH        
Dod |2023-09-08|fre|10:15|DodLabb     |D1.11|Mars     |JM        
Dod |2023-09-08|fre|10:15|DodLabb     |D1.12|Saturnus |JE        
Dod |2023-09-08|fre|15:15|DodLabb     |D1.04|Alfa     |JM        
Dod |2023-09-08|fre|15:15|DodLabb     |D1.05|Beta     |AW        
Dod |2023-09-08|fre|15:15|DodLabb     |D1.06|Gamma    |MG        
Pgk |2023-09-13|ons|10:15|PgkResurstid|D1.01|Alfa     |AN        
Pgk |2023-09-13|ons|10:15|PgkResurstid|D1.02|Beta     |LL        
Pgk |2023-09-13|ons|10:15|PgkResurstid|D1.03|Gamma    |OK        
Pgk |2023-09-13|ons|10:15|PgkResurstid|XA1  |Ambulans1|JM        
Pgk |2023-09-13|ons|10:15|PgkResurstid|XA2  |Ambulans2|RH        
Pgk |2023-09-13|ons|13:15|PgkResurstid|D1.07|Alfa     |JC        
Pgk |2023-09-13|ons|13:15|PgkResurstid|D1.08|Beta     |HP        
Pgk |2023-09-13|ons|13:15|PgkResurstid|D1.09|Gamma    |OB        
Pgk |2023-09-13|ons|13:15|PgkResurstid|XA1  |Ambulans1|AW        
Pgk |2023-09-13|ons|13:15|PgkResurstid|XA2  |Ambulans2|HT        
Pgk |2023-09-13|ons|15:15|PgkResurstid|D1.10|Alfa     |DH        
Pgk |2023-09-13|ons|15:15|PgkResurstid|D1.11|Beta     |PS        
Pgk |2023-09-13|ons|15:15|PgkResurstid|D1.12|Gamma    |HL        
Pgk |2023-09-13|ons|15:15|PgkResurstid|XA1  |Ambulans1|AÅ        
Pgk |2023-09-13|ons|15:15|PgkResurstid|XA2  |Ambulans2|MF        
Pgk |2023-09-14|tor|10:15|PgkResurstid|D1.04|Alfa     |JH        
Pgk |2023-09-14|tor|10:15|PgkResurstid|D1.05|Beta     |MG        
Pgk |2023-09-14|tor|10:15|PgkResurstid|D1.06|Gamma    |TL        
Pgk |2023-09-14|tor|10:15|PgkResurstid|XA1  |Ambulans1|AN        
Pgk |2023-09-14|tor|10:15|PgkResurstid|XA2  |Ambulans2|HX        
Dod |2023-09-14|tor|10:15|DodLabb     |D1.07|Jupiter  |JC        
Dod |2023-09-14|tor|10:15|DodLabb     |D1.08|Mars     |AP        
Dod |2023-09-14|tor|10:15|DodLabb     |D1.09|Saturnus |OB        
Pgk |2023-09-14|tor|13:15|PgkResurstid|C1.01|Falk     |AP        
Pgk |2023-09-14|tor|13:15|PgkResurstid|C1.02|Val      |FA        
Pgk |2023-09-14|tor|13:15|PgkResurstid|C1.03|Varg     |VB        
Pgk |2023-09-14|tor|13:15|PgkResurstid|XA1  |Ambulans1|AM        
Pgk |2023-09-14|tor|13:15|PgkResurstid|XA2  |Ambulans2|PS        
Dod |2023-09-14|tor|13:15|DodLabb     |C1.04|Alfa     |TF        
Dod |2023-09-14|tor|13:15|DodLabb     |C1.05|Beta     |ES        
Dod |2023-09-14|tor|13:15|DodLabb     |C1.06|Gamma    |JC        
Dod |2023-09-14|tor|13:15|DodLabb     |D1.01|Elg      |AN        
Dod |2023-09-14|tor|13:15|DodLabb     |D1.02|Hacke    |DH        
Dod |2023-09-14|tor|13:15|DodLabb     |D1.03|Panter   |OK        
Dod |2023-09-14|tor|13:15|DodLabb     |D1.04|Lo       |EN        
Dod |2023-09-14|tor|13:15|DodLabb     |D1.05|Mars     |MN        
Dod |2023-09-14|tor|13:15|DodLabb     |D1.06|Venus    |AÅ        
Pgk |2023-09-14|tor|15:15|PgkResurstid|C1.04|Falk     |TF        
Pgk |2023-09-14|tor|15:15|PgkResurstid|C1.05|Val      |ES        
Pgk |2023-09-14|tor|15:15|PgkResurstid|C1.06|Varg     |NA        
Pgk |2023-09-14|tor|15:15|PgkResurstid|XA1  |Ambulans1|MG        
Pgk |2023-09-14|tor|15:15|PgkResurstid|XA2  |Ambulans2|AM        
Dod |2023-09-14|tor|15:15|DodLabb     |C1.01|Jupiter  |AP        
Dod |2023-09-14|tor|15:15|DodLabb     |C1.02|Mars     |FA        
Dod |2023-09-14|tor|15:15|DodLabb     |C1.03|Saturnus |VB        
Pgk |2023-09-15|fre|08:15|PgkLabb     |C1.01|Hacke    |AP        
Pgk |2023-09-15|fre|08:15|PgkLabb     |C1.02|Panter   |FA        
Pgk |2023-09-15|fre|08:15|PgkLabb     |XA1  |Ambulans1|LB        
Pgk |2023-09-15|fre|10:15|PgkLabb     |D1.01|Alfa     |AN        
Pgk |2023-09-15|fre|10:15|PgkLabb     |D1.02|Beta     |LL        
Pgk |2023-09-15|fre|10:15|PgkLabb     |D1.03|Gamma    |MF        
Pgk |2023-09-15|fre|10:15|PgkLabb     |D1.04|Hacke    |JH        
Pgk |2023-09-15|fre|10:15|PgkLabb     |D1.05|Val      |MG        
Pgk |2023-09-15|fre|10:15|PgkLabb     |D1.06|Varg     |TL        
Pgk |2023-09-15|fre|10:15|PgkLabb     |XA1  |Ambulans1|LB        
Pgk |2023-09-15|fre|10:15|PgkLabb     |XA2  |Ambulans2|EN        
Pgk |2023-09-15|fre|10:15|PgkLabb     |XA3  |Ambulans3|HX        
Dod |2023-09-15|fre|10:15|DodLabb     |D1.10|Jupiter  |DH        
Dod |2023-09-15|fre|10:15|DodLabb     |D1.11|Mars     |VB        
Dod |2023-09-15|fre|10:15|DodLabb     |D1.12|Saturnus |JC        
Pgk |2023-09-15|fre|13:15|PgkLabb     |C1.03|Alfa     |VB        
Pgk |2023-09-15|fre|13:15|PgkLabb     |C1.04|Beta     |TF        
Pgk |2023-09-15|fre|13:15|PgkLabb     |C1.05|Falk     |ES        
Pgk |2023-09-15|fre|13:15|PgkLabb     |C1.06|Gamma    |MF        
Pgk |2023-09-15|fre|13:15|PgkLabb     |D1.07|Val      |JC        
Pgk |2023-09-15|fre|13:15|PgkLabb     |D1.08|Varg     |HP        
Pgk |2023-09-15|fre|13:15|PgkLabb     |D1.09|Elg      |OB        
Pgk |2023-09-15|fre|13:15|PgkLabb     |D1.10|Hacke    |DH        
Pgk |2023-09-15|fre|13:15|PgkLabb     |D1.11|Lo       |PS        
Pgk |2023-09-15|fre|13:15|PgkLabb     |D1.12|Panter   |HL        
Pgk |2023-09-15|fre|13:15|PgkLabb     |XA1  |Ambulans1|LB        
Pgk |2023-09-15|fre|13:15|PgkLabb     |XA2  |Ambulans2|AM        
Pgk |2023-09-15|fre|13:15|PgkLabb     |XA3  |Ambulans3|HX        
Pgk |2023-09-15|fre|13:15|PgkLabb     |XA4  |Ambulans4|HT        
Pgk |2023-09-15|fre|13:15|PgkLabb     |XA5  |Ambulans5|JM        
Pgk |2023-09-20|ons|10:15|PgkResurstid|D1.01|Alfa     |AN        
Pgk |2023-09-20|ons|10:15|PgkResurstid|D1.02|Beta     |LL        
Pgk |2023-09-20|ons|10:15|PgkResurstid|D1.03|Gamma    |OK        
Pgk |2023-09-20|ons|10:15|PgkResurstid|XA1  |Ambulans1|MG        
Pgk |2023-09-20|ons|10:15|PgkResurstid|XA2  |Ambulans2|AM        
Pgk |2023-09-20|ons|13:15|PgkResurstid|D1.07|Alfa     |JC        
Pgk |2023-09-20|ons|13:15|PgkResurstid|D1.08|Beta     |HP        
Pgk |2023-09-20|ons|13:15|PgkResurstid|D1.09|Gamma    |OB        
Pgk |2023-09-20|ons|13:15|PgkResurstid|XA1  |Ambulans1|RH        
Pgk |2023-09-20|ons|13:15|PgkResurstid|XA2  |Ambulans2|JE        
Pgk |2023-09-20|ons|15:15|PgkResurstid|D1.10|Alfa     |DH        
Pgk |2023-09-20|ons|15:15|PgkResurstid|D1.11|Beta     |PS        
Pgk |2023-09-20|ons|15:15|PgkResurstid|D1.12|Gamma    |HL        
Pgk |2023-09-20|ons|15:15|PgkResurstid|XA1  |Ambulans1|MF        
Pgk |2023-09-20|ons|15:15|PgkResurstid|XA2  |Ambulans2|AÅ        
Pgk |2023-09-21|tor|10:15|PgkResurstid|D1.04|Alfa     |JH        
Pgk |2023-09-21|tor|10:15|PgkResurstid|D1.05|Beta     |HX        
Pgk |2023-09-21|tor|10:15|PgkResurstid|D1.06|Gamma    |TL        
Pgk |2023-09-21|tor|10:15|PgkResurstid|XA1  |Ambulans1|JE        
Pgk |2023-09-21|tor|10:15|PgkResurstid|XA2  |Ambulans2|RH        
Pgk |2023-09-21|tor|13:15|PgkResurstid|C1.01|Falk     |AP        
Pgk |2023-09-21|tor|13:15|PgkResurstid|C1.02|Val      |FA        
Pgk |2023-09-21|tor|13:15|PgkResurstid|C1.03|Varg     |VB        
Pgk |2023-09-21|tor|13:15|PgkResurstid|XA1  |Ambulans1|AW        
Pgk |2023-09-21|tor|13:15|PgkResurstid|XA2  |Ambulans2|JE        
Pgk |2023-09-21|tor|15:15|PgkResurstid|C1.04|Falk     |TF        
Pgk |2023-09-21|tor|15:15|PgkResurstid|C1.05|Val      |ES        
Pgk |2023-09-21|tor|15:15|PgkResurstid|C1.06|Varg     |NA        
Pgk |2023-09-21|tor|15:15|PgkResurstid|XA1  |Ambulans1|OK        
Pgk |2023-09-21|tor|15:15|PgkResurstid|XA2  |Ambulans2|MF        
Pgk |2023-09-22|fre|10:15|PgkLabb     |D1.01|Alfa     |AN        
Pgk |2023-09-22|fre|10:15|PgkLabb     |D1.02|Beta     |LL        
Pgk |2023-09-22|fre|10:15|PgkLabb     |D1.03|Gamma    |OK        
Pgk |2023-09-22|fre|10:15|PgkLabb     |D1.04|Hacke    |JH        
Pgk |2023-09-22|fre|10:15|PgkLabb     |D1.05|Val      |RH        
Pgk |2023-09-22|fre|10:15|PgkLabb     |D1.06|Varg     |TL        
Pgk |2023-09-22|fre|10:15|PgkLabb     |XA1  |Ambulans1|LB        
Pgk |2023-09-22|fre|10:15|PgkLabb     |XA2  |Ambulans2|JM        
Pgk |2023-09-22|fre|10:15|PgkLabb     |XA3  |Ambulans3|HX        
Pgk |2023-09-22|fre|13:15|PgkLabb     |D1.07|Alfa     |JC        
Pgk |2023-09-22|fre|13:15|PgkLabb     |D1.08|Beta     |HP        
Pgk |2023-09-22|fre|13:15|PgkLabb     |D1.09|Falk     |OB        
Pgk |2023-09-22|fre|13:15|PgkLabb     |D1.10|Gamma    |DH        
Pgk |2023-09-22|fre|13:15|PgkLabb     |D1.11|Val      |AM        
Pgk |2023-09-22|fre|13:15|PgkLabb     |D1.12|Varg     |HL        
Pgk |2023-09-22|fre|13:15|PgkLabb     |XA1  |Ambulans1|OK        
Pgk |2023-09-22|fre|13:15|PgkLabb     |XA2  |Ambulans2|HT        
Pgk |2023-09-22|fre|13:15|PgkLabb     |XA3  |Ambulans3|HX        
Pgk |2023-09-22|fre|15:15|PgkLabb     |C1.01|Falk     |AP        
Pgk |2023-09-22|fre|15:15|PgkLabb     |C1.02|Jupiter  |FA        
Pgk |2023-09-22|fre|15:15|PgkLabb     |C1.03|Mars     |VB        
Pgk |2023-09-22|fre|15:15|PgkLabb     |C1.04|Saturnus |TF        
Pgk |2023-09-22|fre|15:15|PgkLabb     |C1.05|Val      |ES        
Pgk |2023-09-22|fre|15:15|PgkLabb     |C1.06|Varg     |NA        
Pgk |2023-09-22|fre|15:15|PgkLabb     |XA1  |Ambulans1|AM        
Pgk |2023-09-22|fre|15:15|PgkLabb     |XA2  |Ambulans2|MG        
Pgk |2023-09-22|fre|15:15|PgkLabb     |XA3  |Ambulans3|AW        
Pgk |2023-09-27|ons|10:15|PgkResurstid|D1.01|Alfa     |AN        
Pgk |2023-09-27|ons|10:15|PgkResurstid|D1.02|Beta     |LL        
Pgk |2023-09-27|ons|10:15|PgkResurstid|D1.03|Gamma    |OK        
Pgk |2023-09-27|ons|10:15|PgkResurstid|XA1  |Ambulans1|RH        
Pgk |2023-09-27|ons|10:15|PgkResurstid|XA2  |Ambulans2|AW        
Pgk |2023-09-27|ons|13:15|PgkResurstid|D1.07|Alfa     |JC        
Pgk |2023-09-27|ons|13:15|PgkResurstid|D1.08|Beta     |HP        
Pgk |2023-09-27|ons|13:15|PgkResurstid|D1.09|Gamma    |OB        
Pgk |2023-09-27|ons|13:15|PgkResurstid|XA1  |Ambulans1|MG        
Pgk |2023-09-27|ons|13:15|PgkResurstid|XA2  |Ambulans2|FA        
Pgk |2023-09-27|ons|15:15|PgkResurstid|D1.10|Alfa     |DH        
Pgk |2023-09-27|ons|15:15|PgkResurstid|D1.11|Beta     |PS        
Pgk |2023-09-27|ons|15:15|PgkResurstid|D1.12|Gamma    |HL        
Pgk |2023-09-27|ons|15:15|PgkResurstid|XA1  |Ambulans1|AM        
Pgk |2023-09-27|ons|15:15|PgkResurstid|XA2  |Ambulans2|AW        
Pgk |2023-09-28|tor|10:15|PgkResurstid|D1.04|Alfa     |JH        
Pgk |2023-09-28|tor|10:15|PgkResurstid|D1.05|Beta     |HT        
Pgk |2023-09-28|tor|10:15|PgkResurstid|D1.06|Gamma    |TL        
Pgk |2023-09-28|tor|10:15|PgkResurstid|XA1  |Ambulans1|NA        
Pgk |2023-09-28|tor|10:15|PgkResurstid|XA2  |Ambulans2|HX        
Pgk |2023-09-28|tor|13:15|PgkResurstid|C1.01|Falk     |AP        
Pgk |2023-09-28|tor|13:15|PgkResurstid|C1.02|Val      |FA        
Pgk |2023-09-28|tor|13:15|PgkResurstid|C1.03|Varg     |VB        
Pgk |2023-09-28|tor|13:15|PgkResurstid|XA1  |Ambulans1|AM        
Pgk |2023-09-28|tor|13:15|PgkResurstid|XA2  |Ambulans2|AÅ        
Pgk |2023-09-28|tor|15:15|PgkResurstid|C1.04|Falk     |TF        
Pgk |2023-09-28|tor|15:15|PgkResurstid|C1.05|Val      |ES        
Pgk |2023-09-28|tor|15:15|PgkResurstid|C1.06|Varg     |NA        
Pgk |2023-09-28|tor|15:15|PgkResurstid|XA1  |Ambulans1|AM        
Pgk |2023-09-28|tor|15:15|PgkResurstid|XA2  |Ambulans2|HT        
Pgk |2023-09-29|fre|10:15|PgkLabb     |D1.01|Alfa     |AN        
Pgk |2023-09-29|fre|10:15|PgkLabb     |D1.02|Beta     |LL        
Pgk |2023-09-29|fre|10:15|PgkLabb     |D1.03|Gamma    |PS        
Pgk |2023-09-29|fre|10:15|PgkLabb     |D1.04|Hacke    |JH        
Pgk |2023-09-29|fre|10:15|PgkLabb     |D1.05|Val      |HT        
Pgk |2023-09-29|fre|10:15|PgkLabb     |D1.06|Varg     |TL        
Pgk |2023-09-29|fre|10:15|PgkLabb     |XA1  |Ambulans1|AÅ        
Pgk |2023-09-29|fre|10:15|PgkLabb     |XA2  |Ambulans2|JC        
Pgk |2023-09-29|fre|10:15|PgkLabb     |XA3  |Ambulans3|MF        
Pgk |2023-09-29|fre|13:15|PgkLabb     |D1.07|Alfa     |JC        
Pgk |2023-09-29|fre|13:15|PgkLabb     |D1.08|Beta     |HP        
Pgk |2023-09-29|fre|13:15|PgkLabb     |D1.09|Falk     |OB        
Pgk |2023-09-29|fre|13:15|PgkLabb     |D1.10|Gamma    |DH        
Pgk |2023-09-29|fre|13:15|PgkLabb     |D1.11|Val      |PS        
Pgk |2023-09-29|fre|13:15|PgkLabb     |D1.12|Varg     |HL        
Pgk |2023-09-29|fre|13:15|PgkLabb     |XA1  |Ambulans1|RH        
Pgk |2023-09-29|fre|13:15|PgkLabb     |XA2  |Ambulans2|EN        
Pgk |2023-09-29|fre|13:15|PgkLabb     |XA3  |Ambulans3|HT        
Pgk |2023-09-29|fre|15:15|PgkLabb     |C1.01|Falk     |AP        
Pgk |2023-09-29|fre|15:15|PgkLabb     |C1.02|Jupiter  |FA        
Pgk |2023-09-29|fre|15:15|PgkLabb     |C1.03|Mars     |VB        
Pgk |2023-09-29|fre|15:15|PgkLabb     |C1.04|Saturnus |TF        
Pgk |2023-09-29|fre|15:15|PgkLabb     |C1.05|Val      |ES        
Pgk |2023-09-29|fre|15:15|PgkLabb     |C1.06|Varg     |NA        
Pgk |2023-09-29|fre|15:15|PgkLabb     |XA1  |Ambulans1|AW        
Pgk |2023-09-29|fre|15:15|PgkLabb     |XA2  |Ambulans2|JM        
Pgk |2023-09-29|fre|15:15|PgkLabb     |XA3  |Ambulans3|MG        
Pgk |2023-10-04|ons|10:15|PgkResurstid|D1.01|Alfa     |AN        
Pgk |2023-10-04|ons|10:15|PgkResurstid|D1.02|Beta     |LL        
Pgk |2023-10-04|ons|10:15|PgkResurstid|D1.03|Gamma    |OK        
Pgk |2023-10-04|ons|10:15|PgkResurstid|XA1  |Ambulans1|JM        
Pgk |2023-10-04|ons|10:15|PgkResurstid|XA2  |Ambulans2|HT        
Pgk |2023-10-04|ons|13:15|PgkResurstid|D1.07|Alfa     |JC        
Pgk |2023-10-04|ons|13:15|PgkResurstid|D1.08|Beta     |HP        
Pgk |2023-10-04|ons|13:15|PgkResurstid|D1.09|Gamma    |OB        
Pgk |2023-10-04|ons|13:15|PgkResurstid|XA1  |Ambulans1|AÅ        
Pgk |2023-10-04|ons|13:15|PgkResurstid|XA2  |Ambulans2|MG        
Pgk |2023-10-04|ons|15:15|PgkResurstid|D1.10|Alfa     |DH        
Pgk |2023-10-04|ons|15:15|PgkResurstid|D1.11|Beta     |AW        
Pgk |2023-10-04|ons|15:15|PgkResurstid|D1.12|Gamma    |HL        
Pgk |2023-10-04|ons|15:15|PgkResurstid|XA1  |Ambulans1|JM        
Pgk |2023-10-04|ons|15:15|PgkResurstid|XA2  |Ambulans2|MF        
Pgk |2023-10-05|tor|10:15|PgkResurstid|D1.04|Alfa     |JH        
Pgk |2023-10-05|tor|10:15|PgkResurstid|D1.05|Beta     |JE        
Pgk |2023-10-05|tor|10:15|PgkResurstid|D1.06|Gamma    |TL        
Pgk |2023-10-05|tor|10:15|PgkResurstid|XA1  |Ambulans1|JM        
Pgk |2023-10-05|tor|10:15|PgkResurstid|XA2  |Ambulans2|AÅ        
Pgk |2023-10-05|tor|13:15|PgkResurstid|C1.01|Falk     |AP        
Pgk |2023-10-05|tor|13:15|PgkResurstid|C1.02|Val      |FA        
Pgk |2023-10-05|tor|13:15|PgkResurstid|C1.03|Varg     |VB        
Pgk |2023-10-05|tor|13:15|PgkResurstid|XA1  |Ambulans1|MF        
Pgk |2023-10-05|tor|13:15|PgkResurstid|XA2  |Ambulans2|JE        
Pgk |2023-10-05|tor|15:15|PgkResurstid|C1.04|Falk     |TF        
Pgk |2023-10-05|tor|15:15|PgkResurstid|C1.05|Val      |ES        
Pgk |2023-10-05|tor|15:15|PgkResurstid|C1.06|Varg     |JM        
Pgk |2023-10-05|tor|15:15|PgkResurstid|XA1  |Ambulans1|MG        
Pgk |2023-10-05|tor|15:15|PgkResurstid|XA2  |Ambulans2|MF        
Pgk |2023-10-06|fre|10:15|PgkLabb     |D1.01|Alfa     |AN        
Pgk |2023-10-06|fre|10:15|PgkLabb     |D1.02|Beta     |LL        
Pgk |2023-10-06|fre|10:15|PgkLabb     |D1.03|Gamma    |OK        
Pgk |2023-10-06|fre|10:15|PgkLabb     |D1.04|Hacke    |JH        
Pgk |2023-10-06|fre|10:15|PgkLabb     |D1.05|Val      |JE        
Pgk |2023-10-06|fre|10:15|PgkLabb     |D1.06|Varg     |TL        
Pgk |2023-10-06|fre|10:15|PgkLabb     |XA1  |Ambulans1|AÅ        
Pgk |2023-10-06|fre|10:15|PgkLabb     |XA2  |Ambulans2|JM        
Pgk |2023-10-06|fre|10:15|PgkLabb     |XA3  |Ambulans3|AW        
Pgk |2023-10-06|fre|13:15|PgkLabb     |D1.07|Alfa     |JC        
Pgk |2023-10-06|fre|13:15|PgkLabb     |D1.08|Beta     |HP        
Pgk |2023-10-06|fre|13:15|PgkLabb     |D1.09|Falk     |OB        
Pgk |2023-10-06|fre|13:15|PgkLabb     |D1.10|Gamma    |DH        
Pgk |2023-10-06|fre|13:15|PgkLabb     |D1.11|Val      |RH        
Pgk |2023-10-06|fre|13:15|PgkLabb     |D1.12|Varg     |HL        
Pgk |2023-10-06|fre|13:15|PgkLabb     |XA1  |Ambulans1|JM        
Pgk |2023-10-06|fre|13:15|PgkLabb     |XA2  |Ambulans2|EN        
Pgk |2023-10-06|fre|13:15|PgkLabb     |XA3  |Ambulans3|AÅ        
Pgk |2023-10-06|fre|15:15|PgkLabb     |C1.01|Falk     |AP        
Pgk |2023-10-06|fre|15:15|PgkLabb     |C1.02|Jupiter  |FA        
Pgk |2023-10-06|fre|15:15|PgkLabb     |C1.03|Mars     |VB        
Pgk |2023-10-06|fre|15:15|PgkLabb     |C1.04|Saturnus |TF        
Pgk |2023-10-06|fre|15:15|PgkLabb     |C1.05|Val      |ES        
Pgk |2023-10-06|fre|15:15|PgkLabb     |C1.06|Varg     |NA        
Pgk |2023-10-06|fre|15:15|PgkLabb     |XA1  |Ambulans1|RH        
Pgk |2023-10-06|fre|15:15|PgkLabb     |XA2  |Ambulans2|AW        
Pgk |2023-10-06|fre|15:15|PgkLabb     |XA3  |Ambulans3|AM        
Pgk |2023-10-11|ons|10:15|PgkResurstid|D1.01|Alfa     |AN        
Pgk |2023-10-11|ons|10:15|PgkResurstid|D1.02|Beta     |LL        
Pgk |2023-10-11|ons|10:15|PgkResurstid|D1.03|Gamma    |OK        
Pgk |2023-10-11|ons|10:15|PgkResurstid|XA1  |Ambulans1|RH        
Pgk |2023-10-11|ons|10:15|PgkResurstid|XA2  |Ambulans2|JM        
Pgk |2023-10-11|ons|13:15|PgkResurstid|D1.07|Alfa     |JC        
Pgk |2023-10-11|ons|13:15|PgkResurstid|D1.08|Beta     |HP        
Pgk |2023-10-11|ons|13:15|PgkResurstid|D1.09|Gamma    |OB        
Pgk |2023-10-11|ons|13:15|PgkResurstid|XA1  |Ambulans1|JE        
Pgk |2023-10-11|ons|13:15|PgkResurstid|XA2  |Ambulans2|MF        
Pgk |2023-10-11|ons|15:15|PgkResurstid|D1.10|Alfa     |DH        
Pgk |2023-10-11|ons|15:15|PgkResurstid|D1.11|Beta     |RH        
Pgk |2023-10-11|ons|15:15|PgkResurstid|D1.12|Gamma    |HL        
Pgk |2023-10-11|ons|15:15|PgkResurstid|XA1  |Ambulans1|HX        
Pgk |2023-10-11|ons|15:15|PgkResurstid|XA2  |Ambulans2|FA        
Pgk |2023-10-12|tor|10:15|PgkResurstid|D1.04|Alfa     |JH        
Pgk |2023-10-12|tor|10:15|PgkResurstid|D1.05|Beta     |HT        
Pgk |2023-10-12|tor|10:15|PgkResurstid|D1.06|Gamma    |TL        
Pgk |2023-10-12|tor|10:15|PgkResurstid|XA1  |Ambulans1|HX        
Pgk |2023-10-12|tor|10:15|PgkResurstid|XA2  |Ambulans2|HP        
Pgk |2023-10-12|tor|13:15|PgkResurstid|C1.01|Falk     |AP        
Pgk |2023-10-12|tor|13:15|PgkResurstid|C1.02|Val      |FA        
Pgk |2023-10-12|tor|13:15|PgkResurstid|C1.03|Varg     |VB        
Pgk |2023-10-12|tor|13:15|PgkResurstid|XA1  |Ambulans1|OK        
Pgk |2023-10-12|tor|13:15|PgkResurstid|XA2  |Ambulans2|RH        
Pgk |2023-10-12|tor|15:15|PgkResurstid|C1.04|Falk     |TF        
Pgk |2023-10-12|tor|15:15|PgkResurstid|C1.05|Val      |ES        
Pgk |2023-10-12|tor|15:15|PgkResurstid|C1.06|Varg     |NA        
Pgk |2023-10-12|tor|15:15|PgkResurstid|XA1  |Ambulans1|AÅ        
Pgk |2023-10-12|tor|15:15|PgkResurstid|XA2  |Ambulans2|MG        
Pgk |2023-10-13|fre|10:15|PgkLabb     |D1.01|Alfa     |AN        
Pgk |2023-10-13|fre|10:15|PgkLabb     |D1.02|Beta     |LL        
Pgk |2023-10-13|fre|10:15|PgkLabb     |D1.03|Gamma    |OK        
Pgk |2023-10-13|fre|10:15|PgkLabb     |D1.04|Hacke    |JH        
Pgk |2023-10-13|fre|10:15|PgkLabb     |D1.05|Val      |JE        
Pgk |2023-10-13|fre|10:15|PgkLabb     |D1.06|Varg     |TL        
Pgk |2023-10-13|fre|10:15|PgkLabb     |XA1  |Ambulans1|AÅ        
Pgk |2023-10-13|fre|10:15|PgkLabb     |XA2  |Ambulans2|EN        
Pgk |2023-10-13|fre|10:15|PgkLabb     |XA3  |Ambulans3|MG        
Pgk |2023-10-13|fre|13:15|PgkLabb     |D1.07|Alfa     |JC        
Pgk |2023-10-13|fre|13:15|PgkLabb     |D1.08|Beta     |HP        
Pgk |2023-10-13|fre|13:15|PgkLabb     |D1.09|Falk     |OB        
Pgk |2023-10-13|fre|13:15|PgkLabb     |D1.10|Gamma    |DH        
Pgk |2023-10-13|fre|13:15|PgkLabb     |D1.11|Val      |PS        
Pgk |2023-10-13|fre|13:15|PgkLabb     |D1.12|Varg     |HL        
Pgk |2023-10-13|fre|13:15|PgkLabb     |XA1  |Ambulans1|MF        
Pgk |2023-10-13|fre|13:15|PgkLabb     |XA2  |Ambulans2|AÅ        
Pgk |2023-10-13|fre|13:15|PgkLabb     |XA3  |Ambulans3|HT        
Pgk |2023-10-13|fre|15:15|PgkLabb     |C1.01|Falk     |AP        
Pgk |2023-10-13|fre|15:15|PgkLabb     |C1.02|Jupiter  |FA        
Pgk |2023-10-13|fre|15:15|PgkLabb     |C1.03|Mars     |VB        
Pgk |2023-10-13|fre|15:15|PgkLabb     |C1.04|Saturnus |TF        
Pgk |2023-10-13|fre|15:15|PgkLabb     |C1.05|Val      |ES        
Pgk |2023-10-13|fre|15:15|PgkLabb     |C1.06|Varg     |NA        
Pgk |2023-10-13|fre|15:15|PgkLabb     |XA1  |Ambulans1|RH        
Pgk |2023-10-13|fre|15:15|PgkLabb     |XA2  |Ambulans2|MG        
Pgk |2023-10-13|fre|15:15|PgkLabb     |XA3  |Ambulans3|MF        
""".trim.split('\n').toSeq