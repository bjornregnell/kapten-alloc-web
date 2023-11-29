package kaptenallocweb
val dataGeneratedFromKaptenAlloc: Seq[String] = """
-----------------------------------------------------------------
kurs|datum     |dag|kl   |typ         |grupp|rum      |handledare
-----------------------------------------------------------------
Pgk |2023-11-01|ons|13:15|PgkResurstid|D1.07|Alfa     |MF        
Pgk |2023-11-01|ons|13:15|PgkResurstid|D1.08|Beta     |PS        
Pgk |2023-11-01|ons|13:15|PgkResurstid|D1.09|Gamma    |VB        
Pgk |2023-11-01|ons|13:15|PgkResurstid|XA1  |Ambulans1|OK        
Pgk |2023-11-01|ons|13:15|PgkResurstid|XA2  |Ambulans2|RH        
Pgk |2023-11-01|ons|15:15|PgkResurstid|D1.04|Alfa     |JH        
Pgk |2023-11-01|ons|15:15|PgkResurstid|D1.05|Beta     |TF        
Pgk |2023-11-01|ons|15:15|PgkResurstid|D1.06|Gamma    |ES        
Pgk |2023-11-01|ons|15:15|PgkResurstid|XA1  |Ambulans1|EN        
Pgk |2023-11-01|ons|15:15|PgkResurstid|XA2  |Ambulans2|RH        
Pgk |2023-11-02|tor|10:15|PgkResurstid|D1.10|Alfa     |DH        
Pgk |2023-11-02|tor|10:15|PgkResurstid|D1.11|Beta     |JM        
Pgk |2023-11-02|tor|10:15|PgkResurstid|D1.12|Gamma    |TL        
Pgk |2023-11-02|tor|10:15|PgkResurstid|XA1  |Ambulans1|EN        
Pgk |2023-11-02|tor|10:15|PgkResurstid|XA2  |Ambulans2|OK        
Pgk |2023-11-02|tor|13:15|PgkResurstid|C1.01|Elg      |NA        
Pgk |2023-11-02|tor|13:15|PgkResurstid|C1.02|Falk     |HL        
Pgk |2023-11-02|tor|13:15|PgkResurstid|C1.03|Hacke    |HP        
Pgk |2023-11-02|tor|13:15|PgkResurstid|C1.04|Lo       |HX        
Pgk |2023-11-02|tor|13:15|PgkResurstid|C1.05|Panter   |HT        
Pgk |2023-11-02|tor|13:15|PgkResurstid|C1.06|Val      |OB        
Pgk |2023-11-02|tor|13:15|PgkResurstid|XA1  |Ambulans1|EN        
Pgk |2023-11-02|tor|13:15|PgkResurstid|XA2  |Ambulans2|RH        
Pgk |2023-11-02|tor|13:15|PgkResurstid|XA3  |Ambulans3|FA        
Pgk |2023-11-02|tor|15:15|PgkResurstid|D1.01|Alfa     |AP        
Pgk |2023-11-02|tor|15:15|PgkResurstid|D1.02|Beta     |JM        
Pgk |2023-11-02|tor|15:15|PgkResurstid|D1.03|Gamma    |JC        
Pgk |2023-11-02|tor|15:15|PgkResurstid|XA1  |Ambulans1|EN        
Pgk |2023-11-02|tor|15:15|PgkResurstid|XA2  |Ambulans2|AÅ        
Pgk |2023-11-03|fre|10:15|PgkLabb     |D1.01|Alfa     |AP        
Pgk |2023-11-03|fre|10:15|PgkLabb     |D1.02|Beta     |JM        
Pgk |2023-11-03|fre|10:15|PgkLabb     |D1.03|Gamma    |JC        
Pgk |2023-11-03|fre|10:15|PgkLabb     |D1.04|Hacke    |JH        
Pgk |2023-11-03|fre|10:15|PgkLabb     |D1.05|Val      |TF        
Pgk |2023-11-03|fre|10:15|PgkLabb     |D1.06|Varg     |ES        
Pgk |2023-11-03|fre|10:15|PgkLabb     |XA1  |Ambulans1|EN        
Pgk |2023-11-03|fre|10:15|PgkLabb     |XA2  |Ambulans2|FA        
Pgk |2023-11-03|fre|10:15|PgkLabb     |XA3  |Ambulans3|AM        
Pgk |2023-11-03|fre|13:15|PgkLabb     |D1.07|Alfa     |OB        
Pgk |2023-11-03|fre|13:15|PgkLabb     |D1.08|Beta     |PS        
Pgk |2023-11-03|fre|13:15|PgkLabb     |D1.09|Falk     |VB        
Pgk |2023-11-03|fre|13:15|PgkLabb     |D1.10|Gamma    |DH        
Pgk |2023-11-03|fre|13:15|PgkLabb     |D1.11|Val      |AN        
Pgk |2023-11-03|fre|13:15|PgkLabb     |D1.12|Varg     |AP        
Pgk |2023-11-03|fre|13:15|PgkLabb     |XA1  |Ambulans1|EN        
Pgk |2023-11-03|fre|13:15|PgkLabb     |XA2  |Ambulans2|RH        
Pgk |2023-11-03|fre|13:15|PgkLabb     |XA3  |Ambulans3|JE        
Pgk |2023-11-03|fre|15:15|PgkLabb     |C1.01|Falk     |NA        
Pgk |2023-11-03|fre|15:15|PgkLabb     |C1.02|Jupiter  |HL        
Pgk |2023-11-03|fre|15:15|PgkLabb     |C1.03|Mars     |HP        
Pgk |2023-11-03|fre|15:15|PgkLabb     |C1.04|Saturnus |HX        
Pgk |2023-11-03|fre|15:15|PgkLabb     |C1.05|Val      |HT        
Pgk |2023-11-03|fre|15:15|PgkLabb     |C1.06|Varg     |OB        
Pgk |2023-11-03|fre|15:15|PgkLabb     |XA1  |Ambulans1|LB        
Pgk |2023-11-03|fre|15:15|PgkLabb     |XA2  |Ambulans2|RH        
Pgk |2023-11-03|fre|15:15|PgkLabb     |XA3  |Ambulans3|OK        
Pgk |2023-11-08|ons|13:15|PgkResurstid|D1.07|Alfa     |MF        
Pgk |2023-11-08|ons|13:15|PgkResurstid|D1.08|Beta     |PS        
Pgk |2023-11-08|ons|13:15|PgkResurstid|D1.09|Gamma    |VB        
Pgk |2023-11-08|ons|13:15|PgkResurstid|XA1  |Ambulans1|EN        
Pgk |2023-11-08|ons|13:15|PgkResurstid|XA2  |Ambulans2|RH        
Pgk |2023-11-08|ons|15:15|PgkResurstid|D1.04|Alfa     |JH        
Pgk |2023-11-08|ons|15:15|PgkResurstid|D1.05|Beta     |TF        
Pgk |2023-11-08|ons|15:15|PgkResurstid|D1.06|Gamma    |ES        
Pgk |2023-11-08|ons|15:15|PgkResurstid|XA1  |Ambulans1|MG        
Pgk |2023-11-08|ons|15:15|PgkResurstid|XA2  |Ambulans2|RH        
Pgk |2023-11-09|tor|10:15|PgkResurstid|D1.10|Alfa     |DH        
Pgk |2023-11-09|tor|10:15|PgkResurstid|D1.11|Beta     |AN        
Pgk |2023-11-09|tor|10:15|PgkResurstid|D1.12|Gamma    |TL        
Pgk |2023-11-09|tor|10:15|PgkResurstid|XA1  |Ambulans1|EN        
Pgk |2023-11-09|tor|10:15|PgkResurstid|XA2  |Ambulans2|RH        
Pgk |2023-11-09|tor|13:15|PgkResurstid|C1.01|Elg      |NA        
Pgk |2023-11-09|tor|13:15|PgkResurstid|C1.02|Falk     |HL        
Pgk |2023-11-09|tor|13:15|PgkResurstid|C1.03|Hacke    |HP        
Pgk |2023-11-09|tor|13:15|PgkResurstid|C1.04|Lo       |HX        
Pgk |2023-11-09|tor|13:15|PgkResurstid|C1.05|Panter   |HT        
Pgk |2023-11-09|tor|13:15|PgkResurstid|C1.06|Val      |OB        
Pgk |2023-11-09|tor|13:15|PgkResurstid|XA1  |Ambulans1|EN        
Pgk |2023-11-09|tor|13:15|PgkResurstid|XA2  |Ambulans2|AÅ        
Pgk |2023-11-09|tor|13:15|PgkResurstid|XA3  |Ambulans3|FA        
Pgk |2023-11-09|tor|15:15|PgkResurstid|D1.01|Alfa     |AP        
Pgk |2023-11-09|tor|15:15|PgkResurstid|D1.02|Beta     |JM        
Pgk |2023-11-09|tor|15:15|PgkResurstid|D1.03|Gamma    |JC        
Pgk |2023-11-09|tor|15:15|PgkResurstid|XA1  |Ambulans1|AÅ        
Pgk |2023-11-09|tor|15:15|PgkResurstid|XA2  |Ambulans2|RH        
Pgk |2023-11-10|fre|10:15|PgkLabb     |D1.01|Alfa     |TL        
Pgk |2023-11-10|fre|10:15|PgkLabb     |D1.02|Beta     |JM        
Pgk |2023-11-10|fre|10:15|PgkLabb     |D1.03|Gamma    |JC        
Pgk |2023-11-10|fre|10:15|PgkLabb     |D1.04|Hacke    |JH        
Pgk |2023-11-10|fre|10:15|PgkLabb     |D1.05|Val      |TF        
Pgk |2023-11-10|fre|10:15|PgkLabb     |D1.06|Varg     |ES        
Pgk |2023-11-10|fre|10:15|PgkLabb     |XA1  |Ambulans1|EN        
Pgk |2023-11-10|fre|10:15|PgkLabb     |XA2  |Ambulans2|RH        
Pgk |2023-11-10|fre|10:15|PgkLabb     |XA3  |Ambulans3|FA        
Pgk |2023-11-10|fre|13:15|PgkLabb     |D1.07|Alfa     |MF        
Pgk |2023-11-10|fre|13:15|PgkLabb     |D1.08|Beta     |PS        
Pgk |2023-11-10|fre|13:15|PgkLabb     |D1.09|Falk     |VB        
Pgk |2023-11-10|fre|13:15|PgkLabb     |D1.10|Gamma    |DH        
Pgk |2023-11-10|fre|13:15|PgkLabb     |D1.11|Val      |AN        
Pgk |2023-11-10|fre|13:15|PgkLabb     |D1.12|Varg     |TL        
Pgk |2023-11-10|fre|13:15|PgkLabb     |XA1  |Ambulans1|EN        
Pgk |2023-11-10|fre|13:15|PgkLabb     |XA2  |Ambulans2|RH        
Pgk |2023-11-10|fre|13:15|PgkLabb     |XA3  |Ambulans3|FA        
Pgk |2023-11-10|fre|15:15|PgkLabb     |C1.01|Falk     |NA        
Pgk |2023-11-10|fre|15:15|PgkLabb     |C1.02|Jupiter  |HL        
Pgk |2023-11-10|fre|15:15|PgkLabb     |C1.03|Mars     |HP        
Pgk |2023-11-10|fre|15:15|PgkLabb     |C1.04|Saturnus |HX        
Pgk |2023-11-10|fre|15:15|PgkLabb     |C1.05|Val      |HT        
Pgk |2023-11-10|fre|15:15|PgkLabb     |C1.06|Varg     |LB        
Pgk |2023-11-10|fre|15:15|PgkLabb     |XA1  |Ambulans1|JM        
Pgk |2023-11-10|fre|15:15|PgkLabb     |XA2  |Ambulans2|RH        
Pgk |2023-11-10|fre|15:15|PgkLabb     |XA3  |Ambulans3|FA        
Pgk |2023-11-15|ons|13:15|PgkResurstid|D1.07|Alfa     |MF        
Pgk |2023-11-15|ons|13:15|PgkResurstid|D1.08|Beta     |PS        
Pgk |2023-11-15|ons|13:15|PgkResurstid|D1.09|Gamma    |JE        
Pgk |2023-11-15|ons|13:15|PgkResurstid|XA1  |Ambulans1|EN        
Pgk |2023-11-15|ons|13:15|PgkResurstid|XA2  |Ambulans2|RH        
Pgk |2023-11-15|ons|15:15|PgkResurstid|D1.04|Alfa     |JH        
Pgk |2023-11-15|ons|15:15|PgkResurstid|D1.05|Beta     |TF        
Pgk |2023-11-15|ons|15:15|PgkResurstid|D1.06|Gamma    |ES        
Pgk |2023-11-15|ons|15:15|PgkResurstid|XA1  |Ambulans1|AM        
Pgk |2023-11-15|ons|15:15|PgkResurstid|XA2  |Ambulans2|MG        
Pgk |2023-11-16|tor|10:15|PgkResurstid|D1.10|Alfa     |DH        
Pgk |2023-11-16|tor|10:15|PgkResurstid|D1.11|Beta     |AN        
Pgk |2023-11-16|tor|10:15|PgkResurstid|D1.12|Gamma    |TL        
Pgk |2023-11-16|tor|10:15|PgkResurstid|XA1  |Ambulans1|MG        
Pgk |2023-11-16|tor|10:15|PgkResurstid|XA2  |Ambulans2|EN        
Pgk |2023-11-16|tor|13:15|PgkResurstid|C1.01|Elg      |NA        
Pgk |2023-11-16|tor|13:15|PgkResurstid|C1.02|Falk     |DH        
Pgk |2023-11-16|tor|13:15|PgkResurstid|C1.03|Hacke    |EN        
Pgk |2023-11-16|tor|13:15|PgkResurstid|C1.04|Lo       |AP        
Pgk |2023-11-16|tor|13:15|PgkResurstid|C1.05|Panter   |TL        
Pgk |2023-11-16|tor|13:15|PgkResurstid|C1.06|Val      |OB        
Pgk |2023-11-16|tor|13:15|PgkResurstid|XA1  |Ambulans1|LB        
Pgk |2023-11-16|tor|13:15|PgkResurstid|XA2  |Ambulans2|JC        
Pgk |2023-11-16|tor|13:15|PgkResurstid|XA3  |Ambulans3|FA        
Pgk |2023-11-16|tor|15:15|PgkResurstid|D1.01|Alfa     |AP        
Pgk |2023-11-16|tor|15:15|PgkResurstid|D1.02|Beta     |AM        
Pgk |2023-11-16|tor|15:15|PgkResurstid|D1.03|Gamma    |NA        
Pgk |2023-11-16|tor|15:15|PgkResurstid|XA1  |Ambulans1|HP        
Pgk |2023-11-16|tor|15:15|PgkResurstid|XA2  |Ambulans2|MG        
Pgk |2023-11-17|fre|10:15|PgkLabb     |D1.01|Alfa     |AP        
Pgk |2023-11-17|fre|10:15|PgkLabb     |D1.02|Beta     |AM        
Pgk |2023-11-17|fre|10:15|PgkLabb     |D1.03|Gamma    |NA        
Pgk |2023-11-17|fre|10:15|PgkLabb     |D1.04|Hacke    |JH        
Pgk |2023-11-17|fre|10:15|PgkLabb     |D1.05|Val      |TF        
Pgk |2023-11-17|fre|10:15|PgkLabb     |D1.06|Varg     |ES        
Pgk |2023-11-17|fre|10:15|PgkLabb     |XA1  |Ambulans1|EN        
Pgk |2023-11-17|fre|10:15|PgkLabb     |XA2  |Ambulans2|MG        
Pgk |2023-11-17|fre|10:15|PgkLabb     |XA3  |Ambulans3|FA        
Pgk |2023-11-17|fre|13:15|PgkLabb     |D1.07|Alfa     |MF        
Pgk |2023-11-17|fre|13:15|PgkLabb     |D1.08|Beta     |PS        
Pgk |2023-11-17|fre|13:15|PgkLabb     |D1.09|Falk     |AÅ        
Pgk |2023-11-17|fre|13:15|PgkLabb     |D1.10|Gamma    |DH        
Pgk |2023-11-17|fre|13:15|PgkLabb     |D1.11|Val      |AN        
Pgk |2023-11-17|fre|13:15|PgkLabb     |D1.12|Varg     |TL        
Pgk |2023-11-17|fre|13:15|PgkLabb     |XA1  |Ambulans1|AP        
Pgk |2023-11-17|fre|13:15|PgkLabb     |XA2  |Ambulans2|AM        
Pgk |2023-11-17|fre|13:15|PgkLabb     |XA3  |Ambulans3|JM        
Pgk |2023-11-17|fre|15:15|PgkLabb     |C1.01|Falk     |NA        
Pgk |2023-11-17|fre|15:15|PgkLabb     |C1.02|Jupiter  |HL        
Pgk |2023-11-17|fre|15:15|PgkLabb     |C1.03|Mars     |HP        
Pgk |2023-11-17|fre|15:15|PgkLabb     |C1.04|Saturnus |HX        
Pgk |2023-11-17|fre|15:15|PgkLabb     |C1.05|Val      |HT        
Pgk |2023-11-17|fre|15:15|PgkLabb     |C1.06|Varg     |OB        
Pgk |2023-11-17|fre|15:15|PgkLabb     |XA1  |Ambulans1|JH        
Pgk |2023-11-17|fre|15:15|PgkLabb     |XA2  |Ambulans2|AÅ        
Pgk |2023-11-17|fre|15:15|PgkLabb     |XA3  |Ambulans3|MG        
Pgk |2023-11-22|ons|13:15|PgkResurstid|D1.07|Alfa     |MF        
Pgk |2023-11-22|ons|13:15|PgkResurstid|D1.08|Beta     |PS        
Pgk |2023-11-22|ons|13:15|PgkResurstid|D1.09|Gamma    |VB        
Pgk |2023-11-22|ons|13:15|PgkResurstid|XA1  |Ambulans1|AW        
Pgk |2023-11-22|ons|13:15|PgkResurstid|XA2  |Ambulans2|AÅ        
Pgk |2023-11-22|ons|15:15|PgkResurstid|D1.04|Alfa     |JH        
Pgk |2023-11-22|ons|15:15|PgkResurstid|D1.05|Beta     |TF        
Pgk |2023-11-22|ons|15:15|PgkResurstid|D1.06|Gamma    |ES        
Pgk |2023-11-22|ons|15:15|PgkResurstid|XA1  |Ambulans1|HX        
Pgk |2023-11-22|ons|15:15|PgkResurstid|XA2  |Ambulans2|AW        
Pgk |2023-11-23|tor|10:15|PgkResurstid|D1.10|Alfa     |DH        
Pgk |2023-11-23|tor|10:15|PgkResurstid|D1.11|Beta     |AN        
Pgk |2023-11-23|tor|10:15|PgkResurstid|D1.12|Gamma    |TL        
Pgk |2023-11-23|tor|10:15|PgkResurstid|XA1  |Ambulans1|JM        
Pgk |2023-11-23|tor|10:15|PgkResurstid|XA2  |Ambulans2|VB        
Pgk |2023-11-23|tor|13:15|PgkResurstid|C1.01|Elg      |NA        
Pgk |2023-11-23|tor|13:15|PgkResurstid|C1.02|Falk     |HL        
Pgk |2023-11-23|tor|13:15|PgkResurstid|C1.03|Hacke    |HP        
Pgk |2023-11-23|tor|13:15|PgkResurstid|C1.04|Lo       |HX        
Pgk |2023-11-23|tor|13:15|PgkResurstid|C1.05|Panter   |HT        
Pgk |2023-11-23|tor|13:15|PgkResurstid|C1.06|Val      |OB        
Pgk |2023-11-23|tor|13:15|PgkResurstid|XA1  |Ambulans1|MF        
Pgk |2023-11-23|tor|13:15|PgkResurstid|XA2  |Ambulans2|AN        
Pgk |2023-11-23|tor|13:15|PgkResurstid|XA3  |Ambulans3|FA        
Pgk |2023-11-23|tor|15:15|PgkResurstid|D1.01|Alfa     |AP        
Pgk |2023-11-23|tor|15:15|PgkResurstid|D1.02|Beta     |JM        
Pgk |2023-11-23|tor|15:15|PgkResurstid|D1.03|Gamma    |JC        
Pgk |2023-11-23|tor|15:15|PgkResurstid|XA1  |Ambulans1|AM        
Pgk |2023-11-23|tor|15:15|PgkResurstid|XA2  |Ambulans2|HT        
Pgk |2023-11-24|fre|10:15|PgkLabb     |D1.01|Alfa     |AP        
Pgk |2023-11-24|fre|10:15|PgkLabb     |D1.02|Beta     |NA        
Pgk |2023-11-24|fre|10:15|PgkLabb     |D1.03|Gamma    |JC        
Pgk |2023-11-24|fre|10:15|PgkLabb     |D1.04|Hacke    |JH        
Pgk |2023-11-24|fre|10:15|PgkLabb     |D1.05|Val      |TF        
Pgk |2023-11-24|fre|10:15|PgkLabb     |D1.06|Varg     |ES        
Pgk |2023-11-24|fre|10:15|PgkLabb     |XA1  |Ambulans1|AM        
Pgk |2023-11-24|fre|10:15|PgkLabb     |XA2  |Ambulans2|TL        
Pgk |2023-11-24|fre|10:15|PgkLabb     |XA3  |Ambulans3|MF        
Pgk |2023-11-24|fre|13:15|PgkLabb     |D1.07|Alfa     |MF        
Pgk |2023-11-24|fre|13:15|PgkLabb     |D1.08|Beta     |PS        
Pgk |2023-11-24|fre|13:15|PgkLabb     |D1.09|Falk     |VB        
Pgk |2023-11-24|fre|13:15|PgkLabb     |D1.10|Gamma    |DH        
Pgk |2023-11-24|fre|13:15|PgkLabb     |D1.11|Val      |AN        
Pgk |2023-11-24|fre|13:15|PgkLabb     |D1.12|Varg     |TL        
Pgk |2023-11-24|fre|13:15|PgkLabb     |XA1  |Ambulans1|EN        
Pgk |2023-11-24|fre|13:15|PgkLabb     |XA2  |Ambulans2|RH        
Pgk |2023-11-24|fre|13:15|PgkLabb     |XA3  |Ambulans3|FA        
Pgk |2023-11-24|fre|15:15|PgkLabb     |C1.01|Falk     |NA        
Pgk |2023-11-24|fre|15:15|PgkLabb     |C1.02|Jupiter  |HL        
Pgk |2023-11-24|fre|15:15|PgkLabb     |C1.03|Mars     |HP        
Pgk |2023-11-24|fre|15:15|PgkLabb     |C1.04|Saturnus |HX        
Pgk |2023-11-24|fre|15:15|PgkLabb     |C1.05|Val      |HT        
Pgk |2023-11-24|fre|15:15|PgkLabb     |C1.06|Varg     |OB        
Pgk |2023-11-24|fre|15:15|PgkLabb     |XA1  |Ambulans1|JM        
Pgk |2023-11-24|fre|15:15|PgkLabb     |XA2  |Ambulans2|AÅ        
Pgk |2023-11-24|fre|15:15|PgkLabb     |XA3  |Ambulans3|FA        
Pgk |2023-11-29|ons|13:15|PgkResurstid|D1.07|Alfa     |--        
Pgk |2023-11-29|ons|13:15|PgkResurstid|D1.08|Beta     |PS        
Pgk |2023-11-29|ons|13:15|PgkResurstid|D1.09|Gamma    |VB        
Pgk |2023-11-29|ons|13:15|PgkResurstid|XA1  |Ambulans1|OK        
Pgk |2023-11-29|ons|13:15|PgkResurstid|XA2  |Ambulans2|AW        
Pgk |2023-11-29|ons|15:15|PgkResurstid|D1.04|Alfa     |JH        
Pgk |2023-11-29|ons|15:15|PgkResurstid|D1.05|Beta     |TF        
Pgk |2023-11-29|ons|15:15|PgkResurstid|D1.06|Gamma    |ES        
Pgk |2023-11-29|ons|15:15|PgkResurstid|XA1  |Ambulans1|AW        
Pgk |2023-11-29|ons|15:15|PgkResurstid|XA2  |Ambulans2|AM        
Pgk |2023-11-30|tor|10:15|PgkResurstid|D1.10|Alfa     |DH        
Pgk |2023-11-30|tor|10:15|PgkResurstid|D1.11|Beta     |AN        
Pgk |2023-11-30|tor|10:15|PgkResurstid|D1.12|Gamma    |TL        
Pgk |2023-11-30|tor|10:15|PgkResurstid|XA1  |Ambulans1|VB        
Pgk |2023-11-30|tor|10:15|PgkResurstid|XA2  |Ambulans2|JH        
Pgk |2023-11-30|tor|13:15|PgkResurstid|C1.01|Elg      |JE        
Pgk |2023-11-30|tor|13:15|PgkResurstid|C1.02|Falk     |HL        
Pgk |2023-11-30|tor|13:15|PgkResurstid|C1.03|Hacke    |HP        
Pgk |2023-11-30|tor|13:15|PgkResurstid|C1.04|Lo       |HX        
Pgk |2023-11-30|tor|13:15|PgkResurstid|C1.05|Panter   |HT        
Pgk |2023-11-30|tor|13:15|PgkResurstid|C1.06|Val      |OB        
Pgk |2023-11-30|tor|13:15|PgkResurstid|XA1  |Ambulans1|DH        
Pgk |2023-11-30|tor|13:15|PgkResurstid|XA2  |Ambulans2|EN        
Pgk |2023-11-30|tor|13:15|PgkResurstid|XA3  |Ambulans3|FA        
Pgk |2023-11-30|tor|15:15|PgkResurstid|D1.01|Alfa     |AP        
Pgk |2023-11-30|tor|15:15|PgkResurstid|D1.02|Beta     |HX        
Pgk |2023-11-30|tor|15:15|PgkResurstid|D1.03|Gamma    |JC        
Pgk |2023-11-30|tor|15:15|PgkResurstid|XA1  |Ambulans1|AM        
Pgk |2023-11-30|tor|15:15|PgkResurstid|XA2  |Ambulans2|MG        
Pgk |2023-12-01|fre|10:15|PgkLabb     |D1.01|Alfa     |AP        
Pgk |2023-12-01|fre|10:15|PgkLabb     |D1.02|Beta     |NA        
Pgk |2023-12-01|fre|10:15|PgkLabb     |D1.03|Gamma    |JC        
Pgk |2023-12-01|fre|10:15|PgkLabb     |D1.04|Hacke    |JH        
Pgk |2023-12-01|fre|10:15|PgkLabb     |D1.05|Val      |TF        
Pgk |2023-12-01|fre|10:15|PgkLabb     |D1.06|Varg     |ES        
Pgk |2023-12-01|fre|10:15|PgkLabb     |XA1  |Ambulans1|PS        
Pgk |2023-12-01|fre|10:15|PgkLabb     |XA2  |Ambulans2|RH        
Pgk |2023-12-01|fre|10:15|PgkLabb     |XA3  |Ambulans3|TL        
Pgk |2023-12-01|fre|13:15|PgkLabb     |D1.07|Alfa     |MF        
Pgk |2023-12-01|fre|13:15|PgkLabb     |D1.08|Beta     |PS        
Pgk |2023-12-01|fre|13:15|PgkLabb     |D1.09|Falk     |VB        
Pgk |2023-12-01|fre|13:15|PgkLabb     |D1.10|Gamma    |DH        
Pgk |2023-12-01|fre|13:15|PgkLabb     |D1.11|Val      |AN        
Pgk |2023-12-01|fre|13:15|PgkLabb     |D1.12|Varg     |TL        
Pgk |2023-12-01|fre|13:15|PgkLabb     |XA1  |Ambulans1|EN        
Pgk |2023-12-01|fre|13:15|PgkLabb     |XA2  |Ambulans2|MG        
Pgk |2023-12-01|fre|13:15|PgkLabb     |XA3  |Ambulans3|AÅ        
Pgk |2023-12-01|fre|15:15|PgkLabb     |C1.01|Falk     |NA        
Pgk |2023-12-01|fre|15:15|PgkLabb     |C1.02|Jupiter  |HL        
Pgk |2023-12-01|fre|15:15|PgkLabb     |C1.03|Mars     |HP        
Pgk |2023-12-01|fre|15:15|PgkLabb     |C1.04|Saturnus |HX        
Pgk |2023-12-01|fre|15:15|PgkLabb     |C1.05|Val      |HT        
Pgk |2023-12-01|fre|15:15|PgkLabb     |C1.06|Varg     |OB        
Pgk |2023-12-01|fre|15:15|PgkLabb     |XA1  |Ambulans1|MG        
Pgk |2023-12-01|fre|15:15|PgkLabb     |XA2  |Ambulans2|VB        
Pgk |2023-12-01|fre|15:15|PgkLabb     |XA3  |Ambulans3|AÅ        
Pgk |2023-12-06|ons|13:15|PgkResurstid|D1.07|Alfa     |MF        
Pgk |2023-12-06|ons|13:15|PgkResurstid|D1.08|Beta     |PS        
Pgk |2023-12-06|ons|13:15|PgkResurstid|D1.09|Gamma    |VB        
Pgk |2023-12-06|ons|13:15|PgkResurstid|XA1  |Ambulans1|AÅ        
Pgk |2023-12-06|ons|13:15|PgkResurstid|XA2  |Ambulans2|AW        
Pgk |2023-12-06|ons|15:15|PgkResurstid|D1.04|Alfa     |NA        
Pgk |2023-12-06|ons|15:15|PgkResurstid|D1.05|Beta     |TF        
Pgk |2023-12-06|ons|15:15|PgkResurstid|D1.06|Gamma    |ES        
Pgk |2023-12-06|ons|15:15|PgkResurstid|XA1  |Ambulans1|HL        
Pgk |2023-12-06|ons|15:15|PgkResurstid|XA2  |Ambulans2|AW        
Pgk |2023-12-07|tor|10:15|PgkResurstid|D1.10|Alfa     |DH        
Pgk |2023-12-07|tor|10:15|PgkResurstid|D1.11|Beta     |AN        
Pgk |2023-12-07|tor|10:15|PgkResurstid|D1.12|Gamma    |TL        
Pgk |2023-12-07|tor|10:15|PgkResurstid|XA1  |Ambulans1|NA        
Pgk |2023-12-07|tor|10:15|PgkResurstid|XA2  |Ambulans2|JM        
Pgk |2023-12-07|tor|13:15|PgkResurstid|C1.01|Elg      |NA        
Pgk |2023-12-07|tor|13:15|PgkResurstid|C1.02|Falk     |HL        
Pgk |2023-12-07|tor|13:15|PgkResurstid|C1.03|Hacke    |HP        
Pgk |2023-12-07|tor|13:15|PgkResurstid|C1.04|Lo       |HX        
Pgk |2023-12-07|tor|13:15|PgkResurstid|C1.05|Panter   |HT        
Pgk |2023-12-07|tor|13:15|PgkResurstid|C1.06|Val      |OB        
Pgk |2023-12-07|tor|13:15|PgkResurstid|XA1  |Ambulans1|DH        
Pgk |2023-12-07|tor|13:15|PgkResurstid|XA2  |Ambulans2|MF        
Pgk |2023-12-07|tor|13:15|PgkResurstid|XA3  |Ambulans3|FA        
Pgk |2023-12-07|tor|15:15|PgkResurstid|D1.01|Alfa     |AP        
Pgk |2023-12-07|tor|15:15|PgkResurstid|D1.02|Beta     |JM        
Pgk |2023-12-07|tor|15:15|PgkResurstid|D1.03|Gamma    |JC        
Pgk |2023-12-07|tor|15:15|PgkResurstid|XA1  |Ambulans1|MG        
Pgk |2023-12-07|tor|15:15|PgkResurstid|XA2  |Ambulans2|AM        
Pgk |2023-12-08|fre|10:15|PgkLabb     |D1.01|Alfa     |AP        
Pgk |2023-12-08|fre|10:15|PgkLabb     |D1.02|Beta     |NA        
Pgk |2023-12-08|fre|10:15|PgkLabb     |D1.03|Gamma    |JC        
Pgk |2023-12-08|fre|10:15|PgkLabb     |D1.04|Hacke    |RH        
Pgk |2023-12-08|fre|10:15|PgkLabb     |D1.05|Val      |TF        
Pgk |2023-12-08|fre|10:15|PgkLabb     |D1.06|Varg     |ES        
Pgk |2023-12-08|fre|10:15|PgkLabb     |XA1  |Ambulans1|TL        
Pgk |2023-12-08|fre|13:15|PgkLabb     |D1.07|Alfa     |MF        
Pgk |2023-12-08|fre|13:15|PgkLabb     |D1.08|Beta     |OK        
Pgk |2023-12-08|fre|13:15|PgkLabb     |D1.09|Falk     |VB        
Pgk |2023-12-08|fre|13:15|PgkLabb     |D1.10|Gamma    |DH        
Pgk |2023-12-08|fre|13:15|PgkLabb     |D1.11|Val      |AN        
Pgk |2023-12-08|fre|13:15|PgkLabb     |D1.12|Varg     |TL        
Pgk |2023-12-08|fre|13:15|PgkLabb     |XA1  |Ambulans1|MG        
Pgk |2023-12-08|fre|13:15|PgkLabb     |XA2  |Ambulans2|AÅ        
Pgk |2023-12-08|fre|13:15|PgkLabb     |XA3  |Ambulans3|FA        
Pgk |2023-12-08|fre|15:15|PgkLabb     |C1.01|Falk     |NA        
Pgk |2023-12-08|fre|15:15|PgkLabb     |C1.02|Jupiter  |HL        
Pgk |2023-12-08|fre|15:15|PgkLabb     |C1.03|Mars     |HP        
Pgk |2023-12-08|fre|15:15|PgkLabb     |C1.04|Saturnus |HX        
Pgk |2023-12-08|fre|15:15|PgkLabb     |C1.05|Val      |HT        
Pgk |2023-12-08|fre|15:15|PgkLabb     |C1.06|Varg     |OB        
Pgk |2023-12-08|fre|15:15|PgkLabb     |XA1  |Ambulans1|MG        
Pgk |2023-12-08|fre|15:15|PgkLabb     |XA2  |Ambulans2|AÅ        
Pgk |2023-12-08|fre|15:15|PgkLabb     |XA3  |Ambulans3|JM        
Pgk |2023-12-13|ons|13:15|PgkResurstid|D1.07|Alfa     |MF        
Pgk |2023-12-13|ons|13:15|PgkResurstid|D1.08|Beta     |PS        
Pgk |2023-12-13|ons|13:15|PgkResurstid|D1.09|Gamma    |VB        
Pgk |2023-12-13|ons|13:15|PgkResurstid|XA1  |Ambulans1|HP        
Pgk |2023-12-13|ons|13:15|PgkResurstid|XA2  |Ambulans2|JE        
Pgk |2023-12-13|ons|15:15|PgkResurstid|D1.04|Alfa     |JH        
Pgk |2023-12-13|ons|15:15|PgkResurstid|D1.05|Beta     |TF        
Pgk |2023-12-13|ons|15:15|PgkResurstid|D1.06|Gamma    |ES        
Pgk |2023-12-13|ons|15:15|PgkResurstid|XA1  |Ambulans1|JE        
Pgk |2023-12-13|ons|15:15|PgkResurstid|XA2  |Ambulans2|OK        
Pgk |2023-12-14|tor|10:15|PgkResurstid|D1.10|Alfa     |DH        
Pgk |2023-12-14|tor|10:15|PgkResurstid|D1.11|Beta     |AN        
Pgk |2023-12-14|tor|10:15|PgkResurstid|D1.12|Gamma    |TL        
Pgk |2023-12-14|tor|10:15|PgkResurstid|XA1  |Ambulans1|JM        
Pgk |2023-12-14|tor|10:15|PgkResurstid|XA2  |Ambulans2|MF        
Pgk |2023-12-14|tor|13:15|PgkResurstid|C1.01|Elg      |NA        
Pgk |2023-12-14|tor|13:15|PgkResurstid|C1.02|Falk     |HL        
Pgk |2023-12-14|tor|13:15|PgkResurstid|C1.03|Hacke    |HP        
Pgk |2023-12-14|tor|13:15|PgkResurstid|C1.04|Lo       |HX        
Pgk |2023-12-14|tor|13:15|PgkResurstid|C1.05|Panter   |HT        
Pgk |2023-12-14|tor|13:15|PgkResurstid|C1.06|Val      |OB        
Pgk |2023-12-14|tor|13:15|PgkResurstid|XA1  |Ambulans1|PS        
Pgk |2023-12-14|tor|13:15|PgkResurstid|XA2  |Ambulans2|AP        
Pgk |2023-12-14|tor|13:15|PgkResurstid|XA3  |Ambulans3|LB        
Pgk |2023-12-14|tor|15:15|PgkResurstid|D1.01|Alfa     |AP        
Pgk |2023-12-14|tor|15:15|PgkResurstid|D1.02|Beta     |AM        
Pgk |2023-12-14|tor|15:15|PgkResurstid|D1.03|Gamma    |JC        
Pgk |2023-12-14|tor|15:15|PgkResurstid|XA1  |Ambulans1|HL        
Pgk |2023-12-14|tor|15:15|PgkResurstid|XA2  |Ambulans2|MG        
""".trim.split('\n').toSeq