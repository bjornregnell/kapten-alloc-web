
package kaptenallocweb

val dataGeneratedFromKaptenAlloc: Seq[String] = """
-----------------------------------------------------------------
kurs|datum     |dag|kl   |typ         |grupp|rum      |handledare
-----------------------------------------------------------------
Dod |2022-08-31|ons|08:15|DodLabb     |C1.04|Falk     |ECe       
Dod |2022-08-31|ons|08:15|DodLabb     |C1.05|Hacke    |EBe       
Dod |2022-08-31|ons|08:15|DodLabb     |C1.06|Panter   |ESt       
Pgk |2022-08-31|ons|10:15|PgkResurstid|D1.01|Alfa     |EBk       
Pgk |2022-08-31|ons|10:15|PgkResurstid|D1.02|Beta     |NSa       
Pgk |2022-08-31|ons|10:15|PgkResurstid|D1.03|Gamma    |APh       
Pgk |2022-08-31|ons|10:15|PgkResurstid|D1.04|Varg     |PSj       
Pgk |2022-08-31|ons|10:15|PgkResurstid|XA1  |Ambulans1|HLi       
Pgk |2022-08-31|ons|10:15|PgkResurstid|XA2  |Ambulans2|NAn       
Dod |2022-08-31|ons|10:15|DodLabb     |D1.11|Falk     |ESt       
Dod |2022-08-31|ons|10:15|DodLabb     |D1.12|Hacke    |EDa       
Dod |2022-08-31|ons|10:15|DodLabb     |D1.13|Panter   |ASa       
Dod |2022-08-31|ons|10:15|DodLabb     |D1.14|Val      |FKa       
Pgk |2022-08-31|ons|13:15|PgkResurstid|D1.12|Alfa     |EDa       
Pgk |2022-08-31|ons|13:15|PgkResurstid|D1.13|Beta     |ASa       
Pgk |2022-08-31|ons|13:15|PgkResurstid|D1.14|Gamma    |PGy       
Pgk |2022-08-31|ons|13:15|PgkResurstid|XA1  |Ambulans1|JHa       
Pgk |2022-08-31|ons|13:15|PgkResurstid|XA2  |Ambulans2|NAn       
Dod |2022-08-31|ons|13:15|DodLabb     |D1.08|Jupiter  |DHe       
Dod |2022-08-31|ons|13:15|DodLabb     |D1.09|Mars     |APh       
Dod |2022-08-31|ons|13:15|DodLabb     |D1.10|Saturnus |JTh       
Pgk |2022-08-31|ons|15:15|PgkResurstid|D1.09|Alfa     |APh       
Pgk |2022-08-31|ons|15:15|PgkResurstid|D1.10|Beta     |JTh       
Pgk |2022-08-31|ons|15:15|PgkResurstid|D1.11|Gamma    |ESt       
Pgk |2022-08-31|ons|15:15|PgkResurstid|XA1  |Ambulans1|PSj       
Pgk |2022-08-31|ons|15:15|PgkResurstid|XA2  |Ambulans2|NAn       
Dod |2022-08-31|ons|15:15|DodLabb     |D1.04|Falk     |ASa       
Dod |2022-08-31|ons|15:15|DodLabb     |D1.05|Hacke    |MWi       
Dod |2022-08-31|ons|15:15|DodLabb     |D1.06|Panter   |AGr       
Dod |2022-08-31|ons|15:15|DodLabb     |D1.07|Val      |FKa       
Pgk |2022-09-01|tor|08:15|PgkResurstid|C1.04|Panter   |ECe       
Pgk |2022-09-01|tor|08:15|PgkResurstid|C1.05|Val      |EBe       
Pgk |2022-09-01|tor|08:15|PgkResurstid|C1.06|Varg     |ESt       
Pgk |2022-09-01|tor|08:15|PgkResurstid|XA1  |Ambulans1|PSj       
Pgk |2022-09-01|tor|08:15|PgkResurstid|XA2  |Ambulans2|AGr       
Pgk |2022-09-01|tor|13:15|PgkResurstid|D1.05|Alfa     |MWi       
Pgk |2022-09-01|tor|13:15|PgkResurstid|D1.06|Beta     |JSw       
Pgk |2022-09-01|tor|13:15|PgkResurstid|D1.07|Gamma    |JHa       
Pgk |2022-09-01|tor|13:15|PgkResurstid|D1.08|Jupiter  |DHe       
Pgk |2022-09-01|tor|13:15|PgkResurstid|W3   |Varg     |NAn       
Pgk |2022-09-01|tor|13:15|PgkResurstid|XA1  |Ambulans1|PSj       
Pgk |2022-09-01|tor|13:15|PgkResurstid|XA2  |Ambulans2|ESt       
Dod |2022-09-01|tor|13:15|DodLabb     |C1.01|Elg      |NSa       
Dod |2022-09-01|tor|13:15|DodLabb     |C1.02|Lo       |PGy       
Dod |2022-09-01|tor|13:15|DodLabb     |C1.03|Val      |AGh       
Pgk |2022-09-01|tor|15:15|PgkResurstid|C1.01|Panter   |JCe       
Pgk |2022-09-01|tor|15:15|PgkResurstid|C1.02|Val      |FKa       
Pgk |2022-09-01|tor|15:15|PgkResurstid|C1.03|Varg     |AGh       
Pgk |2022-09-01|tor|15:15|PgkResurstid|XA1  |Ambulans1|PSj       
Pgk |2022-09-01|tor|15:15|PgkResurstid|XA2  |Ambulans2|NAn       
Dod |2022-09-01|tor|15:15|DodLabb     |D1.01|Jupiter  |EBk       
Dod |2022-09-01|tor|15:15|DodLabb     |D1.02|Mars     |OLe       
Dod |2022-09-01|tor|15:15|DodLabb     |D1.03|Saturnus |HPe       
Pgk |2022-09-02|fre|10:15|PgkLabb     |D1.01|Falk     |EBk       
Pgk |2022-09-02|fre|10:15|PgkLabb     |D1.02|Hacke    |NSa       
Pgk |2022-09-02|fre|10:15|PgkLabb     |D1.03|Jupiter  |APh       
Pgk |2022-09-02|fre|10:15|PgkLabb     |D1.04|Mars     |PSj       
Pgk |2022-09-02|fre|10:15|PgkLabb     |D1.05|Panter   |MWi       
Pgk |2022-09-02|fre|10:15|PgkLabb     |D1.06|Val      |JSw       
Pgk |2022-09-02|fre|10:15|PgkLabb     |D1.07|Varg     |LLi       
Pgk |2022-09-02|fre|10:15|PgkLabb     |XA1  |Ambulans1|OBe       
Pgk |2022-09-02|fre|10:15|PgkLabb     |XA2  |Ambulans2|NAn       
Pgk |2022-09-02|fre|10:15|PgkLabb     |XA3  |Ambulans3|OLe       
Pgk |2022-09-02|fre|10:15|PgkLabb     |XA4  |Ambulans4|HLi       
Pgk |2022-09-02|fre|13:15|PgkLabb     |D1.08|Falk     |DHe       
Pgk |2022-09-02|fre|13:15|PgkLabb     |D1.09|Hacke    |APh       
Pgk |2022-09-02|fre|13:15|PgkLabb     |D1.10|Jupiter  |JTh       
Pgk |2022-09-02|fre|13:15|PgkLabb     |D1.11|Mars     |ESt       
Pgk |2022-09-02|fre|13:15|PgkLabb     |D1.12|Panter   |ANi       
Pgk |2022-09-02|fre|13:15|PgkLabb     |D1.13|Val      |ASa       
Pgk |2022-09-02|fre|13:15|PgkLabb     |W3   |Varg     |NAn       
Pgk |2022-09-02|fre|13:15|PgkLabb     |XA1  |Ambulans1|PSj       
Pgk |2022-09-02|fre|13:15|PgkLabb     |XA2  |Ambulans2|OBe       
Pgk |2022-09-02|fre|13:15|PgkLabb     |XA3  |Ambulans3|OLe       
Pgk |2022-09-02|fre|13:15|PgkLabb     |XA4  |Ambulans4|HLi       
Pgk |2022-09-02|fre|15:15|PgkLabb     |C1.01|Elg      |JCe       
Pgk |2022-09-02|fre|15:15|PgkLabb     |C1.02|Falk     |PGy       
Pgk |2022-09-02|fre|15:15|PgkLabb     |C1.03|Hacke    |AGh       
Pgk |2022-09-02|fre|15:15|PgkLabb     |C1.04|Jupiter  |ECe       
Pgk |2022-09-02|fre|15:15|PgkLabb     |C1.05|Mars     |EBe       
Pgk |2022-09-02|fre|15:15|PgkLabb     |C1.06|Panter   |ESt       
Pgk |2022-09-02|fre|15:15|PgkLabb     |D1.14|Val      |FKa       
Pgk |2022-09-02|fre|15:15|PgkLabb     |XA1  |Ambulans1|PSj       
Pgk |2022-09-02|fre|15:15|PgkLabb     |XA2  |Ambulans2|NAn       
Pgk |2022-09-02|fre|15:15|PgkLabb     |XA3  |Ambulans3|OLe       
Pgk |2022-09-02|fre|15:15|PgkLabb     |XA4  |Ambulans4|HLi       
Dod |2022-09-07|ons|08:15|DodLabb     |C1.04|Falk     |ECe       
Dod |2022-09-07|ons|08:15|DodLabb     |C1.05|Hacke    |EBe       
Dod |2022-09-07|ons|08:15|DodLabb     |C1.06|Panter   |ESt       
Pgk |2022-09-07|ons|10:15|PgkResurstid|D1.01|Alfa     |EBk       
Pgk |2022-09-07|ons|10:15|PgkResurstid|D1.02|Beta     |NSa       
Pgk |2022-09-07|ons|10:15|PgkResurstid|D1.03|Gamma    |APh       
Pgk |2022-09-07|ons|10:15|PgkResurstid|D1.04|Varg     |PSj       
Pgk |2022-09-07|ons|10:15|PgkResurstid|XA1  |Ambulans1|LLi       
Pgk |2022-09-07|ons|10:15|PgkResurstid|XA2  |Ambulans2|NAn       
Dod |2022-09-07|ons|10:15|DodLabb     |D1.11|Falk     |ESt       
Dod |2022-09-07|ons|10:15|DodLabb     |D1.12|Hacke    |EDa       
Dod |2022-09-07|ons|10:15|DodLabb     |D1.13|Panter   |ASa       
Dod |2022-09-07|ons|10:15|DodLabb     |D1.14|Val      |FKa       
Pgk |2022-09-07|ons|13:15|PgkResurstid|D1.12|Alfa     |EDa       
Pgk |2022-09-07|ons|13:15|PgkResurstid|D1.13|Beta     |ASa       
Pgk |2022-09-07|ons|13:15|PgkResurstid|D1.14|Gamma    |FKa       
Pgk |2022-09-07|ons|13:15|PgkResurstid|XA1  |Ambulans1|EBe       
Pgk |2022-09-07|ons|13:15|PgkResurstid|XA2  |Ambulans2|NAn       
Dod |2022-09-07|ons|13:15|DodLabb     |D1.08|Jupiter  |DHe       
Dod |2022-09-07|ons|13:15|DodLabb     |D1.09|Mars     |APh       
Dod |2022-09-07|ons|13:15|DodLabb     |D1.10|Saturnus |JTh       
Pgk |2022-09-07|ons|15:15|PgkResurstid|D1.09|Alfa     |APh       
Pgk |2022-09-07|ons|15:15|PgkResurstid|D1.10|Beta     |JTh       
Pgk |2022-09-07|ons|15:15|PgkResurstid|D1.11|Gamma    |ESt       
Pgk |2022-09-07|ons|15:15|PgkResurstid|XA1  |Ambulans1|PSj       
Pgk |2022-09-07|ons|15:15|PgkResurstid|XA2  |Ambulans2|NAn       
Dod |2022-09-07|ons|15:15|DodLabb     |D1.04|Falk     |EBk       
Dod |2022-09-07|ons|15:15|DodLabb     |D1.05|Hacke    |MWi       
Dod |2022-09-07|ons|15:15|DodLabb     |D1.06|Panter   |ANi       
Dod |2022-09-07|ons|15:15|DodLabb     |D1.07|Val      |EBe       
Pgk |2022-09-08|tor|08:15|PgkResurstid|C1.04|Panter   |ECe       
Pgk |2022-09-08|tor|08:15|PgkResurstid|C1.05|Val      |EBe       
Pgk |2022-09-08|tor|08:15|PgkResurstid|C1.06|Varg     |ESt       
Pgk |2022-09-08|tor|08:15|PgkResurstid|XA1  |Ambulans1|PSj       
Pgk |2022-09-08|tor|08:15|PgkResurstid|XA2  |Ambulans2|JHa       
Pgk |2022-09-08|tor|13:15|PgkResurstid|D1.05|Alfa     |MWi       
Pgk |2022-09-08|tor|13:15|PgkResurstid|D1.06|Beta     |JSw       
Pgk |2022-09-08|tor|13:15|PgkResurstid|D1.07|Gamma    |MSv       
Pgk |2022-09-08|tor|13:15|PgkResurstid|D1.08|Jupiter  |DHe       
Pgk |2022-09-08|tor|13:15|PgkResurstid|W3   |Varg     |NAn       
Pgk |2022-09-08|tor|13:15|PgkResurstid|XA1  |Ambulans1|PSj       
Pgk |2022-09-08|tor|13:15|PgkResurstid|XA2  |Ambulans2|AGr       
Dod |2022-09-08|tor|13:15|DodLabb     |C1.01|Elg      |APh       
Dod |2022-09-08|tor|13:15|DodLabb     |C1.02|Lo       |PGy       
Dod |2022-09-08|tor|13:15|DodLabb     |C1.03|Val      |NSa       
Pgk |2022-09-08|tor|15:15|PgkResurstid|C1.01|Panter   |JCe       
Pgk |2022-09-08|tor|15:15|PgkResurstid|C1.02|Val      |PGy       
Pgk |2022-09-08|tor|15:15|PgkResurstid|C1.03|Varg     |AGh       
Pgk |2022-09-08|tor|15:15|PgkResurstid|XA1  |Ambulans1|JSw       
Pgk |2022-09-08|tor|15:15|PgkResurstid|XA2  |Ambulans2|OLe       
Dod |2022-09-08|tor|15:15|DodLabb     |D1.01|Jupiter  |EBk       
Dod |2022-09-08|tor|15:15|DodLabb     |D1.02|Mars     |LLi       
Dod |2022-09-08|tor|15:15|DodLabb     |D1.03|Saturnus |FKa       
Dod |2022-09-14|ons|08:15|DodLabb     |C1.04|Falk     |ECe       
Dod |2022-09-14|ons|08:15|DodLabb     |C1.05|Hacke    |EBe       
Dod |2022-09-14|ons|08:15|DodLabb     |C1.06|Panter   |ESt       
Pgk |2022-09-14|ons|10:15|PgkResurstid|D1.01|Alfa     |EBk       
Pgk |2022-09-14|ons|10:15|PgkResurstid|D1.02|Beta     |NSa       
Pgk |2022-09-14|ons|10:15|PgkResurstid|D1.03|Gamma    |APh       
Pgk |2022-09-14|ons|10:15|PgkResurstid|D1.04|Varg     |PSj       
Pgk |2022-09-14|ons|10:15|PgkResurstid|XA1  |Ambulans1|LLi       
Pgk |2022-09-14|ons|10:15|PgkResurstid|XA2  |Ambulans2|HLi       
Dod |2022-09-14|ons|10:15|DodLabb     |D1.11|Falk     |ESt       
Dod |2022-09-14|ons|10:15|DodLabb     |D1.12|Hacke    |EDa       
Dod |2022-09-14|ons|10:15|DodLabb     |D1.13|Panter   |ASa       
Dod |2022-09-14|ons|10:15|DodLabb     |D1.14|Val      |FKa       
Pgk |2022-09-14|ons|13:15|PgkResurstid|D1.12|Alfa     |EDa       
Pgk |2022-09-14|ons|13:15|PgkResurstid|D1.13|Beta     |ASa       
Pgk |2022-09-14|ons|13:15|PgkResurstid|D1.14|Gamma    |FKa       
Pgk |2022-09-14|ons|13:15|PgkResurstid|XA1  |Ambulans1|PGy       
Pgk |2022-09-14|ons|13:15|PgkResurstid|XA2  |Ambulans2|OLe       
Dod |2022-09-14|ons|13:15|DodLabb     |D1.08|Jupiter  |DHe       
Dod |2022-09-14|ons|13:15|DodLabb     |D1.09|Mars     |APh       
Dod |2022-09-14|ons|13:15|DodLabb     |D1.10|Saturnus |JTh       
Pgk |2022-09-14|ons|15:15|PgkResurstid|D1.09|Alfa     |APh       
Pgk |2022-09-14|ons|15:15|PgkResurstid|D1.10|Beta     |JTh       
Pgk |2022-09-14|ons|15:15|PgkResurstid|D1.11|Gamma    |ESt       
Pgk |2022-09-14|ons|15:15|PgkResurstid|XA1  |Ambulans1|OLe       
Pgk |2022-09-14|ons|15:15|PgkResurstid|XA2  |Ambulans2|JHa       
Dod |2022-09-14|ons|15:15|DodLabb     |D1.04|Falk     |ANi       
Dod |2022-09-14|ons|15:15|DodLabb     |D1.05|Hacke    |MWi       
Dod |2022-09-14|ons|15:15|DodLabb     |D1.06|Panter   |EDa       
Dod |2022-09-14|ons|15:15|DodLabb     |D1.07|Val      |FKa       
Pgk |2022-09-15|tor|08:15|PgkResurstid|C1.04|Panter   |ECe       
Pgk |2022-09-15|tor|08:15|PgkResurstid|C1.05|Val      |EBe       
Pgk |2022-09-15|tor|08:15|PgkResurstid|C1.06|Varg     |ESt       
Pgk |2022-09-15|tor|08:15|PgkResurstid|XA1  |Ambulans1|PSj       
Pgk |2022-09-15|tor|08:15|PgkResurstid|XA2  |Ambulans2|JHa       
Pgk |2022-09-15|tor|13:15|PgkResurstid|D1.05|Alfa     |MWi       
Pgk |2022-09-15|tor|13:15|PgkResurstid|D1.06|Beta     |JSw       
Pgk |2022-09-15|tor|13:15|PgkResurstid|D1.07|Gamma    |MSv       
Pgk |2022-09-15|tor|13:15|PgkResurstid|D1.08|Jupiter  |DHe       
Pgk |2022-09-15|tor|13:15|PgkResurstid|W3   |Varg     |NAn       
Pgk |2022-09-15|tor|13:15|PgkResurstid|XA1  |Ambulans1|PSj       
Pgk |2022-09-15|tor|13:15|PgkResurstid|XA2  |Ambulans2|JHa       
Dod |2022-09-15|tor|13:15|DodLabb     |C1.01|Elg      |JCe       
Dod |2022-09-15|tor|13:15|DodLabb     |C1.02|Lo       |PGy       
Dod |2022-09-15|tor|13:15|DodLabb     |C1.03|Val      |AGh       
Pgk |2022-09-15|tor|15:15|PgkResurstid|C1.01|Panter   |JCe       
Pgk |2022-09-15|tor|15:15|PgkResurstid|C1.02|Val      |FKa       
Pgk |2022-09-15|tor|15:15|PgkResurstid|C1.03|Varg     |AGh       
Pgk |2022-09-15|tor|15:15|PgkResurstid|XA1  |Ambulans1|PSj       
Pgk |2022-09-15|tor|15:15|PgkResurstid|XA2  |Ambulans2|OLe       
Dod |2022-09-15|tor|15:15|DodLabb     |D1.01|Jupiter  |EBk       
Dod |2022-09-15|tor|15:15|DodLabb     |D1.02|Mars     |DHe       
Dod |2022-09-15|tor|15:15|DodLabb     |D1.03|Saturnus |APh       
Pgk |2022-09-16|fre|10:15|PgkLabb     |D1.01|Falk     |EBk       
Pgk |2022-09-16|fre|10:15|PgkLabb     |D1.02|Hacke    |NSa       
Pgk |2022-09-16|fre|10:15|PgkLabb     |D1.03|Jupiter  |APh       
Pgk |2022-09-16|fre|10:15|PgkLabb     |D1.04|Mars     |PSj       
Pgk |2022-09-16|fre|10:15|PgkLabb     |D1.05|Panter   |AGr       
Pgk |2022-09-16|fre|10:15|PgkLabb     |D1.06|Val      |JSw       
Pgk |2022-09-16|fre|10:15|PgkLabb     |D1.07|Varg     |JHa       
Pgk |2022-09-16|fre|10:15|PgkLabb     |XA1  |Ambulans1|HPe       
Pgk |2022-09-16|fre|10:15|PgkLabb     |XA2  |Ambulans2|LLi       
Pgk |2022-09-16|fre|10:15|PgkLabb     |XA3  |Ambulans3|OLe       
Pgk |2022-09-16|fre|10:15|PgkLabb     |XA4  |Ambulans4|HLi       
Pgk |2022-09-16|fre|13:15|PgkLabb     |D1.08|Falk     |DHe       
Pgk |2022-09-16|fre|13:15|PgkLabb     |D1.09|Hacke    |APh       
Pgk |2022-09-16|fre|13:15|PgkLabb     |D1.10|Jupiter  |JTh       
Pgk |2022-09-16|fre|13:15|PgkLabb     |D1.11|Mars     |ESt       
Pgk |2022-09-16|fre|13:15|PgkLabb     |D1.12|Panter   |MWi       
Pgk |2022-09-16|fre|13:15|PgkLabb     |D1.13|Val      |ASa       
Pgk |2022-09-16|fre|13:15|PgkLabb     |W3   |Varg     |NAn       
Pgk |2022-09-16|fre|13:15|PgkLabb     |XA1  |Ambulans1|PSj       
Pgk |2022-09-16|fre|13:15|PgkLabb     |XA2  |Ambulans2|JSw       
Pgk |2022-09-16|fre|13:15|PgkLabb     |XA3  |Ambulans3|EBk       
Pgk |2022-09-16|fre|13:15|PgkLabb     |XA4  |Ambulans4|PGy       
Pgk |2022-09-16|fre|15:15|PgkLabb     |C1.01|Elg      |JCe       
Pgk |2022-09-16|fre|15:15|PgkLabb     |C1.02|Falk     |PGy       
Pgk |2022-09-16|fre|15:15|PgkLabb     |C1.03|Hacke    |AGh       
Pgk |2022-09-16|fre|15:15|PgkLabb     |C1.04|Jupiter  |ECe       
Pgk |2022-09-16|fre|15:15|PgkLabb     |C1.05|Mars     |EBe       
Pgk |2022-09-16|fre|15:15|PgkLabb     |C1.06|Panter   |ESt       
Pgk |2022-09-16|fre|15:15|PgkLabb     |D1.14|Val      |FKa       
Pgk |2022-09-16|fre|15:15|PgkLabb     |XA1  |Ambulans1|PSj       
Pgk |2022-09-16|fre|15:15|PgkLabb     |XA2  |Ambulans2|NAn       
Pgk |2022-09-16|fre|15:15|PgkLabb     |XA3  |Ambulans3|OLe       
Pgk |2022-09-16|fre|15:15|PgkLabb     |XA4  |Ambulans4|MWi       
Pgk |2022-09-21|ons|10:15|PgkResurstid|D1.01|Alfa     |EBk       
Pgk |2022-09-21|ons|10:15|PgkResurstid|D1.02|Beta     |NSa       
Pgk |2022-09-21|ons|10:15|PgkResurstid|D1.03|Gamma    |APh       
Pgk |2022-09-21|ons|10:15|PgkResurstid|D1.04|Varg     |HPe       
Pgk |2022-09-21|ons|10:15|PgkResurstid|XA1  |Ambulans1|HLi       
Pgk |2022-09-21|ons|10:15|PgkResurstid|XA2  |Ambulans2|AGr       
Pgk |2022-09-21|ons|13:15|PgkResurstid|D1.12|Alfa     |EDa       
Pgk |2022-09-21|ons|13:15|PgkResurstid|D1.13|Beta     |ASa       
Pgk |2022-09-21|ons|13:15|PgkResurstid|D1.14|Gamma    |PGy       
Pgk |2022-09-21|ons|13:15|PgkResurstid|XA1  |Ambulans1|PSj       
Pgk |2022-09-21|ons|13:15|PgkResurstid|XA2  |Ambulans2|MWi       
Pgk |2022-09-21|ons|15:15|PgkResurstid|D1.09|Alfa     |APh       
Pgk |2022-09-21|ons|15:15|PgkResurstid|D1.10|Beta     |JTh       
Pgk |2022-09-21|ons|15:15|PgkResurstid|D1.11|Gamma    |ESt       
Pgk |2022-09-21|ons|15:15|PgkResurstid|XA1  |Ambulans1|PSj       
Pgk |2022-09-21|ons|15:15|PgkResurstid|XA2  |Ambulans2|ANi       
Pgk |2022-09-22|tor|08:15|PgkResurstid|C1.04|Panter   |ECe       
Pgk |2022-09-22|tor|08:15|PgkResurstid|C1.05|Val      |EBe       
Pgk |2022-09-22|tor|08:15|PgkResurstid|C1.06|Varg     |ESt       
Pgk |2022-09-22|tor|08:15|PgkResurstid|XA1  |Ambulans1|PSj       
Pgk |2022-09-22|tor|08:15|PgkResurstid|XA2  |Ambulans2|AGr       
Pgk |2022-09-22|tor|13:15|PgkResurstid|D1.05|Alfa     |MWi       
Pgk |2022-09-22|tor|13:15|PgkResurstid|D1.06|Beta     |JSw       
Pgk |2022-09-22|tor|13:15|PgkResurstid|D1.07|Gamma    |MSv       
Pgk |2022-09-22|tor|13:15|PgkResurstid|D1.08|Jupiter  |DHe       
Pgk |2022-09-22|tor|13:15|PgkResurstid|W3   |Varg     |NAn       
Pgk |2022-09-22|tor|13:15|PgkResurstid|XA1  |Ambulans1|PSj       
Pgk |2022-09-22|tor|13:15|PgkResurstid|XA2  |Ambulans2|OBe       
Pgk |2022-09-22|tor|15:15|PgkResurstid|C1.01|Panter   |JCe       
Pgk |2022-09-22|tor|15:15|PgkResurstid|C1.02|Val      |FKa       
Pgk |2022-09-22|tor|15:15|PgkResurstid|C1.03|Varg     |AGh       
Pgk |2022-09-22|tor|15:15|PgkResurstid|XA1  |Ambulans1|PSj       
Pgk |2022-09-22|tor|15:15|PgkResurstid|XA2  |Ambulans2|HPe       
Pgk |2022-09-23|fre|10:15|PgkLabb     |D1.01|Falk     |EBk       
Pgk |2022-09-23|fre|10:15|PgkLabb     |D1.02|Hacke    |NSa       
Pgk |2022-09-23|fre|10:15|PgkLabb     |D1.03|Jupiter  |APh       
Pgk |2022-09-23|fre|10:15|PgkLabb     |D1.04|Mars     |PSj       
Pgk |2022-09-23|fre|10:15|PgkLabb     |D1.05|Panter   |OBe       
Pgk |2022-09-23|fre|10:15|PgkLabb     |D1.06|Val      |JSw       
Pgk |2022-09-23|fre|10:15|PgkLabb     |D1.07|Varg     |LLi       
Pgk |2022-09-23|fre|10:15|PgkLabb     |XA1  |Ambulans1|ANi       
Pgk |2022-09-23|fre|10:15|PgkLabb     |XA2  |Ambulans2|NAn       
Pgk |2022-09-23|fre|10:15|PgkLabb     |XA3  |Ambulans3|OLe       
Pgk |2022-09-23|fre|10:15|PgkLabb     |XA4  |Ambulans4|HLi       
Pgk |2022-09-23|fre|13:15|PgkLabb     |D1.08|Falk     |DHe       
Pgk |2022-09-23|fre|13:15|PgkLabb     |D1.09|Hacke    |APh       
Pgk |2022-09-23|fre|13:15|PgkLabb     |D1.10|Jupiter  |JTh       
Pgk |2022-09-23|fre|13:15|PgkLabb     |D1.11|Mars     |ESt       
Pgk |2022-09-23|fre|13:15|PgkLabb     |D1.12|Panter   |MWi       
Pgk |2022-09-23|fre|13:15|PgkLabb     |D1.13|Val      |ASa       
Pgk |2022-09-23|fre|13:15|PgkLabb     |W3   |Varg     |NAn       
Pgk |2022-09-23|fre|13:15|PgkLabb     |XA1  |Ambulans1|PSj       
Pgk |2022-09-23|fre|13:15|PgkLabb     |XA2  |Ambulans2|ECe       
Pgk |2022-09-23|fre|13:15|PgkLabb     |XA3  |Ambulans3|PGy       
Pgk |2022-09-23|fre|13:15|PgkLabb     |XA4  |Ambulans4|JSw       
Pgk |2022-09-23|fre|15:15|PgkLabb     |C1.01|Elg      |JCe       
Pgk |2022-09-23|fre|15:15|PgkLabb     |C1.02|Falk     |PGy       
Pgk |2022-09-23|fre|15:15|PgkLabb     |C1.03|Hacke    |AGh       
Pgk |2022-09-23|fre|15:15|PgkLabb     |C1.04|Jupiter  |ECe       
Pgk |2022-09-23|fre|15:15|PgkLabb     |C1.05|Mars     |EBe       
Pgk |2022-09-23|fre|15:15|PgkLabb     |C1.06|Panter   |ESt       
Pgk |2022-09-23|fre|15:15|PgkLabb     |D1.14|Val      |FKa       
Pgk |2022-09-23|fre|15:15|PgkLabb     |XA1  |Ambulans1|PSj       
Pgk |2022-09-23|fre|15:15|PgkLabb     |XA2  |Ambulans2|NAn       
Pgk |2022-09-23|fre|15:15|PgkLabb     |XA3  |Ambulans3|OLe       
Pgk |2022-09-23|fre|15:15|PgkLabb     |XA4  |Ambulans4|OBe       
Pgk |2022-09-28|ons|10:15|PgkResurstid|D1.01|Alfa     |EBk       
Pgk |2022-09-28|ons|10:15|PgkResurstid|D1.02|Beta     |NSa       
Pgk |2022-09-28|ons|10:15|PgkResurstid|D1.03|Gamma    |APh       
Pgk |2022-09-28|ons|10:15|PgkResurstid|D1.04|Varg     |PSj       
Pgk |2022-09-28|ons|10:15|PgkResurstid|XA1  |Ambulans1|AGr       
Pgk |2022-09-28|ons|10:15|PgkResurstid|XA2  |Ambulans2|LLi       
Pgk |2022-09-28|ons|13:15|PgkResurstid|D1.12|Alfa     |EDa       
Pgk |2022-09-28|ons|13:15|PgkResurstid|D1.13|Beta     |ASa       
Pgk |2022-09-28|ons|13:15|PgkResurstid|D1.14|Gamma    |PGy       
Pgk |2022-09-28|ons|13:15|PgkResurstid|XA1  |Ambulans1|ANi       
Pgk |2022-09-28|ons|13:15|PgkResurstid|XA2  |Ambulans2|OBe       
Pgk |2022-09-28|ons|15:15|PgkResurstid|D1.09|Alfa     |APh       
Pgk |2022-09-28|ons|15:15|PgkResurstid|D1.10|Beta     |JTh       
Pgk |2022-09-28|ons|15:15|PgkResurstid|D1.11|Gamma    |ESt       
Pgk |2022-09-28|ons|15:15|PgkResurstid|XA1  |Ambulans1|HPe       
Pgk |2022-09-28|ons|15:15|PgkResurstid|XA2  |Ambulans2|HLi       
Pgk |2022-09-29|tor|08:15|PgkResurstid|C1.04|Panter   |ECe       
Pgk |2022-09-29|tor|08:15|PgkResurstid|C1.05|Val      |EBe       
Pgk |2022-09-29|tor|08:15|PgkResurstid|C1.06|Varg     |ESt       
Pgk |2022-09-29|tor|08:15|PgkResurstid|XA1  |Ambulans1|AGr       
Pgk |2022-09-29|tor|08:15|PgkResurstid|XA2  |Ambulans2|EBk       
Pgk |2022-09-29|tor|13:15|PgkResurstid|D1.05|Alfa     |MWi       
Pgk |2022-09-29|tor|13:15|PgkResurstid|D1.06|Beta     |JSw       
Pgk |2022-09-29|tor|13:15|PgkResurstid|D1.07|Gamma    |MSv       
Pgk |2022-09-29|tor|13:15|PgkResurstid|D1.08|Jupiter  |DHe       
Pgk |2022-09-29|tor|13:15|PgkResurstid|W3   |Varg     |NAn       
Pgk |2022-09-29|tor|13:15|PgkResurstid|XA1  |Ambulans1|OLe       
Pgk |2022-09-29|tor|13:15|PgkResurstid|XA2  |Ambulans2|LLi       
Pgk |2022-09-29|tor|15:15|PgkResurstid|C1.01|Panter   |JCe       
Pgk |2022-09-29|tor|15:15|PgkResurstid|C1.02|Val      |FKa       
Pgk |2022-09-29|tor|15:15|PgkResurstid|C1.03|Varg     |AGh       
Pgk |2022-09-29|tor|15:15|PgkResurstid|XA1  |Ambulans1|OLe       
Pgk |2022-09-29|tor|15:15|PgkResurstid|XA2  |Ambulans2|LLi       
Pgk |2022-09-30|fre|10:15|PgkLabb     |D1.01|Falk     |EBk       
Pgk |2022-09-30|fre|10:15|PgkLabb     |D1.02|Hacke    |NSa       
Pgk |2022-09-30|fre|10:15|PgkLabb     |D1.03|Jupiter  |APh       
Pgk |2022-09-30|fre|10:15|PgkLabb     |D1.04|Mars     |PSj       
Pgk |2022-09-30|fre|10:15|PgkLabb     |D1.05|Panter   |HPe       
Pgk |2022-09-30|fre|10:15|PgkLabb     |D1.06|Val      |JSw       
Pgk |2022-09-30|fre|10:15|PgkLabb     |D1.07|Varg     |JHa       
Pgk |2022-09-30|fre|10:15|PgkLabb     |XA1  |Ambulans1|AGr       
Pgk |2022-09-30|fre|10:15|PgkLabb     |XA2  |Ambulans2|DHe       
Pgk |2022-09-30|fre|10:15|PgkLabb     |XA3  |Ambulans3|OLe       
Pgk |2022-09-30|fre|10:15|PgkLabb     |XA4  |Ambulans4|HLi       
Pgk |2022-09-30|fre|13:15|PgkLabb     |D1.08|Falk     |DHe       
Pgk |2022-09-30|fre|13:15|PgkLabb     |D1.09|Hacke    |APh       
Pgk |2022-09-30|fre|13:15|PgkLabb     |D1.10|Jupiter  |JTh       
Pgk |2022-09-30|fre|13:15|PgkLabb     |D1.11|Mars     |ESt       
Pgk |2022-09-30|fre|13:15|PgkLabb     |D1.12|Panter   |HPe       
Pgk |2022-09-30|fre|13:15|PgkLabb     |D1.13|Val      |ASa       
Pgk |2022-09-30|fre|13:15|PgkLabb     |W3   |Varg     |NAn       
Pgk |2022-09-30|fre|13:15|PgkLabb     |XA1  |Ambulans1|ANi       
Pgk |2022-09-30|fre|13:15|PgkLabb     |XA2  |Ambulans2|JCe       
Pgk |2022-09-30|fre|13:15|PgkLabb     |XA3  |Ambulans3|OLe       
Pgk |2022-09-30|fre|13:15|PgkLabb     |XA4  |Ambulans4|HLi       
Pgk |2022-09-30|fre|15:15|PgkLabb     |C1.01|Elg      |JCe       
Pgk |2022-09-30|fre|15:15|PgkLabb     |C1.02|Falk     |PGy       
Pgk |2022-09-30|fre|15:15|PgkLabb     |C1.03|Hacke    |AGh       
Pgk |2022-09-30|fre|15:15|PgkLabb     |C1.04|Jupiter  |ECe       
Pgk |2022-09-30|fre|15:15|PgkLabb     |C1.05|Mars     |EBe       
Pgk |2022-09-30|fre|15:15|PgkLabb     |C1.06|Panter   |ESt       
Pgk |2022-09-30|fre|15:15|PgkLabb     |D1.14|Val      |FKa       
Pgk |2022-09-30|fre|15:15|PgkLabb     |XA1  |Ambulans1|JHa       
Pgk |2022-09-30|fre|15:15|PgkLabb     |XA2  |Ambulans2|NAn       
Pgk |2022-09-30|fre|15:15|PgkLabb     |XA3  |Ambulans3|OLe       
Pgk |2022-09-30|fre|15:15|PgkLabb     |XA4  |Ambulans4|HLi       
Pgk |2022-10-05|ons|10:15|PgkResurstid|D1.01|Alfa     |EBk       
Pgk |2022-10-05|ons|10:15|PgkResurstid|D1.02|Beta     |NSa       
Pgk |2022-10-05|ons|10:15|PgkResurstid|D1.03|Gamma    |APh       
Pgk |2022-10-05|ons|10:15|PgkResurstid|D1.04|Varg     |PSj       
Pgk |2022-10-05|ons|10:15|PgkResurstid|XA1  |Ambulans1|LLi       
Pgk |2022-10-05|ons|10:15|PgkResurstid|XA2  |Ambulans2|HPe       
Pgk |2022-10-05|ons|13:15|PgkResurstid|D1.12|Alfa     |EDa       
Pgk |2022-10-05|ons|13:15|PgkResurstid|D1.13|Beta     |ASa       
Pgk |2022-10-05|ons|13:15|PgkResurstid|D1.14|Gamma    |PGy       
Pgk |2022-10-05|ons|13:15|PgkResurstid|XA1  |Ambulans1|OBe       
Pgk |2022-10-05|ons|13:15|PgkResurstid|XA2  |Ambulans2|OLe       
Pgk |2022-10-05|ons|15:15|PgkResurstid|D1.09|Alfa     |APh       
Pgk |2022-10-05|ons|15:15|PgkResurstid|D1.10|Beta     |JTh       
Pgk |2022-10-05|ons|15:15|PgkResurstid|D1.11|Gamma    |ESt       
Pgk |2022-10-05|ons|15:15|PgkResurstid|XA1  |Ambulans1|HPe       
Pgk |2022-10-05|ons|15:15|PgkResurstid|XA2  |Ambulans2|HLi       
Pgk |2022-10-06|tor|08:15|PgkResurstid|C1.04|Panter   |ECe       
Pgk |2022-10-06|tor|08:15|PgkResurstid|C1.05|Val      |EBe       
Pgk |2022-10-06|tor|08:15|PgkResurstid|C1.06|Varg     |ESt       
Pgk |2022-10-06|tor|08:15|PgkResurstid|XA1  |Ambulans1|ANi       
Pgk |2022-10-06|tor|08:15|PgkResurstid|XA2  |Ambulans2|OBe       
Pgk |2022-10-06|tor|13:15|PgkResurstid|D1.05|Alfa     |MWi       
Pgk |2022-10-06|tor|13:15|PgkResurstid|D1.06|Beta     |JSw       
Pgk |2022-10-06|tor|13:15|PgkResurstid|D1.07|Gamma    |MSv       
Pgk |2022-10-06|tor|13:15|PgkResurstid|D1.08|Jupiter  |DHe       
Pgk |2022-10-06|tor|13:15|PgkResurstid|W3   |Varg     |NAn       
Pgk |2022-10-06|tor|13:15|PgkResurstid|XA1  |Ambulans1|LLi       
Pgk |2022-10-06|tor|13:15|PgkResurstid|XA2  |Ambulans2|ANi       
Pgk |2022-10-06|tor|15:15|PgkResurstid|C1.01|Panter   |JCe       
Pgk |2022-10-06|tor|15:15|PgkResurstid|C1.02|Val      |FKa       
Pgk |2022-10-06|tor|15:15|PgkResurstid|C1.03|Varg     |AGh       
Pgk |2022-10-06|tor|15:15|PgkResurstid|XA1  |Ambulans1|OLe       
Pgk |2022-10-06|tor|15:15|PgkResurstid|XA2  |Ambulans2|OBe       
Pgk |2022-10-07|fre|10:15|PgkLabb     |D1.01|Falk     |EBk       
Pgk |2022-10-07|fre|10:15|PgkLabb     |D1.02|Hacke    |NSa       
Pgk |2022-10-07|fre|10:15|PgkLabb     |D1.03|Jupiter  |APh       
Pgk |2022-10-07|fre|10:15|PgkLabb     |D1.04|Mars     |PSj       
Pgk |2022-10-07|fre|10:15|PgkLabb     |D1.05|Panter   |AGr       
Pgk |2022-10-07|fre|10:15|PgkLabb     |D1.06|Val      |JSw       
Pgk |2022-10-07|fre|10:15|PgkLabb     |D1.07|Varg     |JHa       
Pgk |2022-10-07|fre|10:15|PgkLabb     |XA1  |Ambulans1|DHe       
Pgk |2022-10-07|fre|10:15|PgkLabb     |XA2  |Ambulans2|JCe       
Pgk |2022-10-07|fre|10:15|PgkLabb     |XA3  |Ambulans3|OLe       
Pgk |2022-10-07|fre|10:15|PgkLabb     |XA4  |Ambulans4|ECe       
Pgk |2022-10-07|fre|13:15|PgkLabb     |D1.08|Falk     |DHe       
Pgk |2022-10-07|fre|13:15|PgkLabb     |D1.09|Hacke    |APh       
Pgk |2022-10-07|fre|13:15|PgkLabb     |D1.10|Jupiter  |JTh       
Pgk |2022-10-07|fre|13:15|PgkLabb     |D1.11|Mars     |ESt       
Pgk |2022-10-07|fre|13:15|PgkLabb     |D1.12|Panter   |ANi       
Pgk |2022-10-07|fre|13:15|PgkLabb     |D1.13|Val      |ASa       
Pgk |2022-10-07|fre|13:15|PgkLabb     |W3   |Varg     |NAn       
Pgk |2022-10-07|fre|13:15|PgkLabb     |XA1  |Ambulans1|HPe       
Pgk |2022-10-07|fre|13:15|PgkLabb     |XA2  |Ambulans2|AGh       
Pgk |2022-10-07|fre|13:15|PgkLabb     |XA3  |Ambulans3|OLe       
Pgk |2022-10-07|fre|13:15|PgkLabb     |XA4  |Ambulans4|HLi       
Pgk |2022-10-07|fre|15:15|PgkLabb     |C1.01|Elg      |JCe       
Pgk |2022-10-07|fre|15:15|PgkLabb     |C1.02|Falk     |PGy       
Pgk |2022-10-07|fre|15:15|PgkLabb     |C1.03|Hacke    |AGh       
Pgk |2022-10-07|fre|15:15|PgkLabb     |C1.04|Jupiter  |ECe       
Pgk |2022-10-07|fre|15:15|PgkLabb     |C1.05|Mars     |EBe       
Pgk |2022-10-07|fre|15:15|PgkLabb     |C1.06|Panter   |ESt       
Pgk |2022-10-07|fre|15:15|PgkLabb     |D1.14|Val      |FKa       
Pgk |2022-10-07|fre|15:15|PgkLabb     |XA1  |Ambulans1|OBe       
Pgk |2022-10-07|fre|15:15|PgkLabb     |XA2  |Ambulans2|MWi       
Pgk |2022-10-07|fre|15:15|PgkLabb     |XA3  |Ambulans3|LLi       
Pgk |2022-10-07|fre|15:15|PgkLabb     |XA4  |Ambulans4|HLi       
Pgk |2022-10-12|ons|10:15|PgkResurstid|D1.01|Alfa     |EBk       
Pgk |2022-10-12|ons|10:15|PgkResurstid|D1.02|Beta     |NSa       
Pgk |2022-10-12|ons|10:15|PgkResurstid|D1.03|Gamma    |APh       
Pgk |2022-10-12|ons|10:15|PgkResurstid|D1.04|Varg     |PSj       
Pgk |2022-10-12|ons|10:15|PgkResurstid|XA1  |Ambulans1|LLi       
Pgk |2022-10-12|ons|10:15|PgkResurstid|XA2  |Ambulans2|HPe       
Pgk |2022-10-12|ons|13:15|PgkResurstid|D1.12|Alfa     |EDa       
Pgk |2022-10-12|ons|13:15|PgkResurstid|D1.13|Beta     |ASa       
Pgk |2022-10-12|ons|13:15|PgkResurstid|D1.14|Gamma    |PGy       
Pgk |2022-10-12|ons|13:15|PgkResurstid|XA1  |Ambulans1|OBe       
Pgk |2022-10-12|ons|13:15|PgkResurstid|XA2  |Ambulans2|ANi       
Pgk |2022-10-12|ons|15:15|PgkResurstid|D1.09|Alfa     |APh       
Pgk |2022-10-12|ons|15:15|PgkResurstid|D1.10|Beta     |JTh       
Pgk |2022-10-12|ons|15:15|PgkResurstid|D1.11|Gamma    |ESt       
Pgk |2022-10-12|ons|15:15|PgkResurstid|XA1  |Ambulans1|OBe       
Pgk |2022-10-12|ons|15:15|PgkResurstid|XA2  |Ambulans2|ANi       
Pgk |2022-10-13|tor|08:15|PgkResurstid|C1.04|Panter   |ECe       
Pgk |2022-10-13|tor|08:15|PgkResurstid|C1.05|Val      |AGr       
Pgk |2022-10-13|tor|08:15|PgkResurstid|C1.06|Varg     |ESt       
Pgk |2022-10-13|tor|08:15|PgkResurstid|XA1  |Ambulans1|JHa       
Pgk |2022-10-13|tor|08:15|PgkResurstid|XA2  |Ambulans2|MSv       
Pgk |2022-10-13|tor|13:15|PgkResurstid|D1.05|Alfa     |ANi       
Pgk |2022-10-13|tor|13:15|PgkResurstid|D1.06|Beta     |JSw       
Pgk |2022-10-13|tor|13:15|PgkResurstid|D1.07|Gamma    |MSv       
Pgk |2022-10-13|tor|13:15|PgkResurstid|D1.08|Jupiter  |DHe       
Pgk |2022-10-13|tor|13:15|PgkResurstid|W3   |Varg     |NAn       
Pgk |2022-10-13|tor|13:15|PgkResurstid|XA1  |Ambulans1|HPe       
Pgk |2022-10-13|tor|13:15|PgkResurstid|XA2  |Ambulans2|HLi       
Pgk |2022-10-13|tor|15:15|PgkResurstid|C1.01|Panter   |JCe       
Pgk |2022-10-13|tor|15:15|PgkResurstid|C1.02|Val      |FKa       
Pgk |2022-10-13|tor|15:15|PgkResurstid|C1.03|Varg     |AGh       
Pgk |2022-10-13|tor|15:15|PgkResurstid|XA1  |Ambulans1|HLi       
Pgk |2022-10-13|tor|15:15|PgkResurstid|XA2  |Ambulans2|OLe       
Pgk |2022-10-14|fre|10:15|PgkLabb     |D1.01|Falk     |EBk       
Pgk |2022-10-14|fre|10:15|PgkLabb     |D1.02|Hacke    |NSa       
Pgk |2022-10-14|fre|10:15|PgkLabb     |D1.03|Jupiter  |APh       
Pgk |2022-10-14|fre|10:15|PgkLabb     |D1.04|Mars     |PSj       
Pgk |2022-10-14|fre|10:15|PgkLabb     |D1.05|Panter   |AGr       
Pgk |2022-10-14|fre|10:15|PgkLabb     |D1.06|Val      |JSw       
Pgk |2022-10-14|fre|10:15|PgkLabb     |D1.07|Varg     |LLi       
Pgk |2022-10-14|fre|10:15|PgkLabb     |XA1  |Ambulans1|JHa       
Pgk |2022-10-14|fre|10:15|PgkLabb     |XA2  |Ambulans2|HPe       
Pgk |2022-10-14|fre|10:15|PgkLabb     |XA3  |Ambulans3|ANi       
Pgk |2022-10-14|fre|10:15|PgkLabb     |XA4  |Ambulans4|HLi       
Pgk |2022-10-14|fre|13:15|PgkLabb     |D1.08|Falk     |DHe       
Pgk |2022-10-14|fre|13:15|PgkLabb     |D1.09|Hacke    |APh       
Pgk |2022-10-14|fre|13:15|PgkLabb     |D1.10|Jupiter  |JTh       
Pgk |2022-10-14|fre|13:15|PgkLabb     |D1.11|Mars     |ESt       
Pgk |2022-10-14|fre|13:15|PgkLabb     |D1.12|Panter   |JCe       
Pgk |2022-10-14|fre|13:15|PgkLabb     |D1.13|Val      |ASa       
Pgk |2022-10-14|fre|13:15|PgkLabb     |W3   |Varg     |NAn       
Pgk |2022-10-14|fre|13:15|PgkLabb     |XA1  |Ambulans1|EBe       
Pgk |2022-10-14|fre|13:15|PgkLabb     |XA2  |Ambulans2|PGy       
Pgk |2022-10-14|fre|13:15|PgkLabb     |XA3  |Ambulans3|ECe       
Pgk |2022-10-14|fre|13:15|PgkLabb     |XA4  |Ambulans4|JSw       
Pgk |2022-10-14|fre|15:15|PgkLabb     |C1.01|Elg      |JCe       
Pgk |2022-10-14|fre|15:15|PgkLabb     |C1.02|Falk     |PGy       
Pgk |2022-10-14|fre|15:15|PgkLabb     |C1.03|Hacke    |AGh       
Pgk |2022-10-14|fre|15:15|PgkLabb     |C1.04|Jupiter  |ECe       
Pgk |2022-10-14|fre|15:15|PgkLabb     |C1.05|Mars     |EBe       
Pgk |2022-10-14|fre|15:15|PgkLabb     |C1.06|Panter   |ESt       
Pgk |2022-10-14|fre|15:15|PgkLabb     |D1.14|Val      |FKa       
Pgk |2022-10-14|fre|15:15|PgkLabb     |XA1  |Ambulans1|EBk       
Pgk |2022-10-14|fre|15:15|PgkLabb     |XA2  |Ambulans2|DHe       
Pgk |2022-10-14|fre|15:15|PgkLabb     |XA3  |Ambulans3|JSw       
Pgk |2022-10-14|fre|15:15|PgkLabb     |XA4  |Ambulans4|HLi       
""".trim.split('\n').toSeq
