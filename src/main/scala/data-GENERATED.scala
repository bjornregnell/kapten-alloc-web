package kaptenallocweb
val dataGeneratedFromKaptenAlloc: Seq[String] = """
-----------------------------------------------------------------
kurs|datum     |dag|kl   |typ         |grupp|rum      |handledare
-----------------------------------------------------------------
Pgk |2022-11-02|ons|13:15|PgkResurstid|D1.01|Alfa     |EBk       
Pgk |2022-11-02|ons|13:15|PgkResurstid|D1.02|Beta     |JCe       
Pgk |2022-11-02|ons|13:15|PgkResurstid|D1.03|Gamma    |ANi       
Pgk |2022-11-02|ons|13:15|PgkResurstid|D1.04|Jupiter  |PGy       
Pgk |2022-11-02|ons|13:15|PgkResurstid|D1.05|Mars     |HLi       
Pgk |2022-11-02|ons|13:15|PgkResurstid|XAO  |Ambulans1|LLi       
Pgk |2022-11-02|ons|13:15|PgkResurstid|XA2  |Ambulans2|FKa       
Pgk |2022-11-02|ons|15:15|PgkResurstid|D1.06|Alfa     |ECe       
Pgk |2022-11-02|ons|15:15|PgkResurstid|D1.07|Beta     |EDa       
Pgk |2022-11-02|ons|15:15|PgkResurstid|D1.08|Falk     |DHe       
Pgk |2022-11-02|ons|15:15|PgkResurstid|D1.09|Gamma    |ASa       
Pgk |2022-11-02|ons|15:15|PgkResurstid|D1.10|Hacke    |JHa       
Pgk |2022-11-02|ons|15:15|PgkResurstid|XAO  |Ambulans1|LLi       
Pgk |2022-11-02|ons|15:15|PgkResurstid|XA2  |Ambulans2|MWi       
Pgk |2022-11-03|tor|10:15|PgkResurstid|C1.01|Alfa     |AGh       
Pgk |2022-11-03|tor|10:15|PgkResurstid|C1.02|Beta     |NAn       
Pgk |2022-11-03|tor|10:15|PgkResurstid|C1.03|Gamma    |NSa       
Pgk |2022-11-03|tor|10:15|PgkResurstid|XAO  |Ambulans1|LLi       
Pgk |2022-11-03|tor|10:15|PgkResurstid|XA2  |Ambulans2|ESt       
Pgk |2022-11-03|tor|13:15|PgkResurstid|D1.11|Falk     |JHa       
Pgk |2022-11-03|tor|13:15|PgkResurstid|D1.12|Jupiter  |OBe       
Pgk |2022-11-03|tor|13:15|PgkResurstid|D1.13|Panter   |PSj       
Pgk |2022-11-03|tor|13:15|PgkResurstid|D1.14|Saturnus |FKa       
Pgk |2022-11-03|tor|13:15|PgkResurstid|W3   |Varg     |NAn       
Pgk |2022-11-03|tor|13:15|PgkResurstid|XAO  |Ambulans1|LLi       
Pgk |2022-11-03|tor|13:15|PgkResurstid|XA2  |Ambulans2|EBk       
Pgk |2022-11-03|tor|15:15|PgkResurstid|C1.04|Panter   |JTh       
Pgk |2022-11-03|tor|15:15|PgkResurstid|C1.05|Val      |APh       
Pgk |2022-11-03|tor|15:15|PgkResurstid|C1.06|Varg     |ESt       
Pgk |2022-11-03|tor|15:15|PgkResurstid|XAO  |Ambulans1|LLi       
Pgk |2022-11-03|tor|15:15|PgkResurstid|XA2  |Ambulans2|OBe       
Pgk |2022-11-04|fre|08:15|PgkLabb     |D1.01|Beta     |EBk       
Pgk |2022-11-04|fre|08:15|PgkLabb     |D1.02|Jupiter  |JCe       
Pgk |2022-11-04|fre|08:15|PgkLabb     |D1.03|Mars     |JSw       
Pgk |2022-11-04|fre|08:15|PgkLabb     |D1.04|Panter   |PGy       
Pgk |2022-11-04|fre|08:15|PgkLabb     |D1.05|Saturnus |JHa       
Pgk |2022-11-04|fre|08:15|PgkLabb     |D1.06|Val      |ECe       
Pgk |2022-11-04|fre|08:15|PgkLabb     |D1.07|Varg     |OLe       
Pgk |2022-11-04|fre|08:15|PgkLabb     |XAO  |Ambulans |HPe       
Pgk |2022-11-04|fre|08:15|PgkLabb     |XA2  |Ambulans |AGh       
Pgk |2022-11-04|fre|08:15|PgkLabb     |XA3  |Ambulans |ANi       
Pgk |2022-11-04|fre|13:15|PgkLabb     |D1.08|Alfa     |DHe       
Pgk |2022-11-04|fre|13:15|PgkLabb     |D1.09|Beta     |ASa       
Pgk |2022-11-04|fre|13:15|PgkLabb     |D1.10|Gamma    |ANi       
Pgk |2022-11-04|fre|13:15|PgkLabb     |D1.11|Jupiter  |HLi       
Pgk |2022-11-04|fre|13:15|PgkLabb     |D1.12|Mars     |OBe       
Pgk |2022-11-04|fre|13:15|PgkLabb     |D1.13|Panter   |HPe       
Pgk |2022-11-04|fre|13:15|PgkLabb     |D1.14|Saturnus |APh       
Pgk |2022-11-04|fre|13:15|PgkLabb     |W3   |Varg     |NAn       
Pgk |2022-11-04|fre|13:15|PgkLabb     |XAO  |Ambulans1|LLi       
Pgk |2022-11-04|fre|13:15|PgkLabb     |XA2  |Ambulans2|EBk       
Pgk |2022-11-04|fre|13:15|PgkLabb     |XA3  |Ambulans3|PSj       
Pgk |2022-11-04|fre|15:15|PgkLabb     |C1.01|Elg      |OBe       
Pgk |2022-11-04|fre|15:15|PgkLabb     |C1.02|Falk     |NAn       
Pgk |2022-11-04|fre|15:15|PgkLabb     |C1.03|Hacke    |NSa       
Pgk |2022-11-04|fre|15:15|PgkLabb     |C1.04|Panter   |JTh       
Pgk |2022-11-04|fre|15:15|PgkLabb     |C1.05|Val      |APh       
Pgk |2022-11-04|fre|15:15|PgkLabb     |C1.06|Varg     |ESt       
Pgk |2022-11-04|fre|15:15|PgkLabb     |XAO  |Ambulans1|LLi       
Pgk |2022-11-04|fre|15:15|PgkLabb     |XA2  |Ambulans2|HLi       
Pgk |2022-11-04|fre|15:15|PgkLabb     |XA3  |Ambulans3|HPe       
Pgk |2022-11-09|ons|13:15|PgkResurstid|D1.01|Alfa     |EBk       
Pgk |2022-11-09|ons|13:15|PgkResurstid|D1.02|Beta     |JCe       
Pgk |2022-11-09|ons|13:15|PgkResurstid|D1.03|Gamma    |HLi       
Pgk |2022-11-09|ons|13:15|PgkResurstid|D1.04|Jupiter  |PGy       
Pgk |2022-11-09|ons|13:15|PgkResurstid|D1.05|Mars     |PSj       
Pgk |2022-11-09|ons|13:15|PgkResurstid|XAO  |Ambulans1|LLi       
Pgk |2022-11-09|ons|13:15|PgkResurstid|XA2  |Ambulans2|AGh       
Pgk |2022-11-09|ons|15:15|PgkResurstid|D1.06|Alfa     |ECe       
Pgk |2022-11-09|ons|15:15|PgkResurstid|D1.07|Beta     |EDa       
Pgk |2022-11-09|ons|15:15|PgkResurstid|D1.08|Falk     |DHe       
Pgk |2022-11-09|ons|15:15|PgkResurstid|D1.09|Gamma    |ASa       
Pgk |2022-11-09|ons|15:15|PgkResurstid|D1.10|Hacke    |OBe       
Pgk |2022-11-09|ons|15:15|PgkResurstid|XAO  |Ambulans1|LLi       
Pgk |2022-11-09|ons|15:15|PgkResurstid|XA2  |Ambulans2|MWi       
Pgk |2022-11-10|tor|10:15|PgkResurstid|C1.01|Alfa     |AGh       
Pgk |2022-11-10|tor|10:15|PgkResurstid|C1.02|Beta     |NAn       
Pgk |2022-11-10|tor|10:15|PgkResurstid|C1.03|Gamma    |NSa       
Pgk |2022-11-10|tor|10:15|PgkResurstid|XAO  |Ambulans1|LLi       
Pgk |2022-11-10|tor|10:15|PgkResurstid|XA2  |Ambulans2|MWi       
Pgk |2022-11-10|tor|13:15|PgkResurstid|D1.11|Falk     |HLi       
Pgk |2022-11-10|tor|13:15|PgkResurstid|D1.12|Jupiter  |OBe       
Pgk |2022-11-10|tor|13:15|PgkResurstid|D1.13|Panter   |HPe       
Pgk |2022-11-10|tor|13:15|PgkResurstid|D1.14|Saturnus |FKa       
Pgk |2022-11-10|tor|13:15|PgkResurstid|W3   |Varg     |NAn       
Pgk |2022-11-10|tor|13:15|PgkResurstid|XAO  |Ambulans1|LLi       
Pgk |2022-11-10|tor|13:15|PgkResurstid|XA2  |Ambulans2|MWi       
Pgk |2022-11-10|tor|15:15|PgkResurstid|C1.04|Panter   |JTh       
Pgk |2022-11-10|tor|15:15|PgkResurstid|C1.05|Val      |APh       
Pgk |2022-11-10|tor|15:15|PgkResurstid|C1.06|Varg     |ESt       
Pgk |2022-11-10|tor|15:15|PgkResurstid|XAO  |Ambulans1|LLi       
Pgk |2022-11-10|tor|15:15|PgkResurstid|XA2  |Ambulans2|MWi       
Pgk |2022-11-11|fre|08:15|PgkLabb     |D1.01|Beta     |EBk       
Pgk |2022-11-11|fre|08:15|PgkLabb     |D1.02|Jupiter  |JCe       
Pgk |2022-11-11|fre|08:15|PgkLabb     |D1.03|Mars     |JSw       
Pgk |2022-11-11|fre|08:15|PgkLabb     |D1.04|Panter   |PGy       
Pgk |2022-11-11|fre|08:15|PgkLabb     |D1.05|Saturnus |JHa       
Pgk |2022-11-11|fre|08:15|PgkLabb     |D1.06|Val      |ECe       
Pgk |2022-11-11|fre|08:15|PgkLabb     |D1.07|Varg     |OBe       
Pgk |2022-11-11|fre|08:15|PgkLabb     |XAO  |Ambulans |HPe       
Pgk |2022-11-11|fre|08:15|PgkLabb     |XA2  |Ambulans |AGh       
Pgk |2022-11-11|fre|13:15|PgkLabb     |D1.08|Alfa     |DHe       
Pgk |2022-11-11|fre|13:15|PgkLabb     |D1.09|Beta     |ASa       
Pgk |2022-11-11|fre|13:15|PgkLabb     |D1.10|Gamma    |ECe       
Pgk |2022-11-11|fre|13:15|PgkLabb     |D1.11|Jupiter  |HLi       
Pgk |2022-11-11|fre|13:15|PgkLabb     |D1.12|Mars     |OBe       
Pgk |2022-11-11|fre|13:15|PgkLabb     |D1.13|Panter   |HPe       
Pgk |2022-11-11|fre|13:15|PgkLabb     |D1.14|Saturnus |AGh       
Pgk |2022-11-11|fre|13:15|PgkLabb     |W3   |Varg     |NAn       
Pgk |2022-11-11|fre|13:15|PgkLabb     |XAO  |Ambulans1|LLi       
Pgk |2022-11-11|fre|13:15|PgkLabb     |XA2  |Ambulans2|MWi       
Pgk |2022-11-11|fre|13:15|PgkLabb     |XA3  |Ambulans3|PSj       
Pgk |2022-11-11|fre|15:15|PgkLabb     |C1.01|Elg      |AGh       
Pgk |2022-11-11|fre|15:15|PgkLabb     |C1.02|Falk     |NAn       
Pgk |2022-11-11|fre|15:15|PgkLabb     |C1.03|Hacke    |NSa       
Pgk |2022-11-11|fre|15:15|PgkLabb     |C1.04|Panter   |JTh       
Pgk |2022-11-11|fre|15:15|PgkLabb     |C1.05|Val      |APh       
Pgk |2022-11-11|fre|15:15|PgkLabb     |C1.06|Varg     |ESt       
Pgk |2022-11-11|fre|15:15|PgkLabb     |XAO  |Ambulans1|LLi       
Pgk |2022-11-11|fre|15:15|PgkLabb     |XA2  |Ambulans2|MWi       
Pgk |2022-11-11|fre|15:15|PgkLabb     |XA3  |Ambulans3|PSj       
Pgk |2022-11-16|ons|13:15|PgkResurstid|D1.01|Alfa     |EBk       
Pgk |2022-11-16|ons|13:15|PgkResurstid|D1.02|Beta     |JCe       
Pgk |2022-11-16|ons|13:15|PgkResurstid|D1.03|Gamma    |ANi       
Pgk |2022-11-16|ons|13:15|PgkResurstid|D1.04|Jupiter  |PGy       
Pgk |2022-11-16|ons|13:15|PgkResurstid|D1.05|Mars     |PSj       
Pgk |2022-11-16|ons|13:15|PgkResurstid|XAO  |Ambulans1|LLi       
Pgk |2022-11-16|ons|13:15|PgkResurstid|XA2  |Ambulans2|AGh       
Pgk |2022-11-16|ons|15:15|PgkResurstid|D1.06|Alfa     |ECe       
Pgk |2022-11-16|ons|15:15|PgkResurstid|D1.07|Beta     |EDa       
Pgk |2022-11-16|ons|15:15|PgkResurstid|D1.08|Falk     |DHe       
Pgk |2022-11-16|ons|15:15|PgkResurstid|D1.09|Gamma    |AGh       
Pgk |2022-11-16|ons|15:15|PgkResurstid|D1.10|Hacke    |ANi       
Pgk |2022-11-16|ons|15:15|PgkResurstid|XAO  |Ambulans1|LLi       
Pgk |2022-11-16|ons|15:15|PgkResurstid|XA2  |Ambulans2|MWi       
Pgk |2022-11-17|tor|10:15|PgkResurstid|C1.01|Alfa     |AGh       
Pgk |2022-11-17|tor|10:15|PgkResurstid|C1.02|Beta     |NAn       
Pgk |2022-11-17|tor|10:15|PgkResurstid|C1.03|Gamma    |NSa       
Pgk |2022-11-17|tor|10:15|PgkResurstid|XAO  |Ambulans1|EBk       
Pgk |2022-11-17|tor|10:15|PgkResurstid|XA2  |Ambulans2|MWi       
Pgk |2022-11-17|tor|13:15|PgkResurstid|D1.11|Falk     |JTh       
Pgk |2022-11-17|tor|13:15|PgkResurstid|D1.12|Jupiter  |NSa       
Pgk |2022-11-17|tor|13:15|PgkResurstid|D1.13|Panter   |EBk       
Pgk |2022-11-17|tor|13:15|PgkResurstid|D1.14|Saturnus |DHe       
Pgk |2022-11-17|tor|13:15|PgkResurstid|W3   |Varg     |NAn       
Pgk |2022-11-17|tor|13:15|PgkResurstid|XAO  |Ambulans1|ESt       
Pgk |2022-11-17|tor|13:15|PgkResurstid|XA2  |Ambulans2|PGy       
Pgk |2022-11-17|tor|15:15|PgkResurstid|C1.04|Panter   |JTh       
Pgk |2022-11-17|tor|15:15|PgkResurstid|C1.05|Val      |APh       
Pgk |2022-11-17|tor|15:15|PgkResurstid|C1.06|Varg     |ESt       
Pgk |2022-11-17|tor|15:15|PgkResurstid|XAO  |Ambulans1|AGr       
Pgk |2022-11-17|tor|15:15|PgkResurstid|XA2  |Ambulans2|DHe       
Pgk |2022-11-18|fre|08:15|PgkLabb     |D1.01|Beta     |EBk       
Pgk |2022-11-18|fre|08:15|PgkLabb     |D1.02|Jupiter  |JCe       
Pgk |2022-11-18|fre|08:15|PgkLabb     |D1.03|Mars     |JSw       
Pgk |2022-11-18|fre|08:15|PgkLabb     |D1.04|Panter   |PGy       
Pgk |2022-11-18|fre|08:15|PgkLabb     |D1.05|Saturnus |JHa       
Pgk |2022-11-18|fre|08:15|PgkLabb     |D1.06|Val      |ECe       
Pgk |2022-11-18|fre|08:15|PgkLabb     |D1.07|Varg     |OLe       
Pgk |2022-11-18|fre|08:15|PgkLabb     |XAO  |Ambulans |HPe       
Pgk |2022-11-18|fre|08:15|PgkLabb     |XA2  |Ambulans |AGh       
Pgk |2022-11-18|fre|13:15|PgkLabb     |D1.08|Alfa     |DHe       
Pgk |2022-11-18|fre|13:15|PgkLabb     |D1.09|Beta     |ASa       
Pgk |2022-11-18|fre|13:15|PgkLabb     |D1.10|Gamma    |EBk       
Pgk |2022-11-18|fre|13:15|PgkLabb     |D1.11|Jupiter  |ANi       
Pgk |2022-11-18|fre|13:15|PgkLabb     |D1.12|Mars     |HLi       
Pgk |2022-11-18|fre|13:15|PgkLabb     |D1.13|Panter   |AGh       
Pgk |2022-11-18|fre|13:15|PgkLabb     |D1.14|Saturnus |ESt       
Pgk |2022-11-18|fre|13:15|PgkLabb     |W3   |Varg     |NAn       
Pgk |2022-11-18|fre|13:15|PgkLabb     |XAO  |Ambulans1|PSj       
Pgk |2022-11-18|fre|13:15|PgkLabb     |XA2  |Ambulans2|OPe       
Pgk |2022-11-18|fre|15:15|PgkLabb     |C1.01|Elg      |AGh       
Pgk |2022-11-18|fre|15:15|PgkLabb     |C1.02|Falk     |NAn       
Pgk |2022-11-18|fre|15:15|PgkLabb     |C1.03|Hacke    |NSa       
Pgk |2022-11-18|fre|15:15|PgkLabb     |C1.04|Panter   |JTh       
Pgk |2022-11-18|fre|15:15|PgkLabb     |C1.05|Val      |EBk       
Pgk |2022-11-18|fre|15:15|PgkLabb     |C1.06|Varg     |ESt       
Pgk |2022-11-18|fre|15:15|PgkLabb     |XAO  |Ambulans1|ECe       
Pgk |2022-11-18|fre|15:15|PgkLabb     |XA2  |Ambulans2|MWi       
Pgk |2022-11-18|fre|15:15|PgkLabb     |XA3  |Ambulans3|PSj       
Pgk |2022-11-23|ons|13:15|PgkResurstid|D1.01|Alfa     |EBk       
Pgk |2022-11-23|ons|13:15|PgkResurstid|D1.02|Beta     |JCe       
Pgk |2022-11-23|ons|13:15|PgkResurstid|D1.03|Gamma    |HPe       
Pgk |2022-11-23|ons|13:15|PgkResurstid|D1.04|Jupiter  |PGy       
Pgk |2022-11-23|ons|13:15|PgkResurstid|D1.05|Mars     |JHa       
Pgk |2022-11-23|ons|13:15|PgkResurstid|XAO  |Ambulans1|LLi       
Pgk |2022-11-23|ons|13:15|PgkResurstid|XA2  |Ambulans2|FKa       
Pgk |2022-11-23|ons|15:15|PgkResurstid|D1.06|Alfa     |ECe       
Pgk |2022-11-23|ons|15:15|PgkResurstid|D1.07|Beta     |EDa       
Pgk |2022-11-23|ons|15:15|PgkResurstid|D1.08|Falk     |DHe       
Pgk |2022-11-23|ons|15:15|PgkResurstid|D1.09|Gamma    |ASa       
Pgk |2022-11-23|ons|15:15|PgkResurstid|D1.10|Hacke    |PSj       
Pgk |2022-11-23|ons|15:15|PgkResurstid|XAO  |Ambulans1|LLi       
Pgk |2022-11-23|ons|15:15|PgkResurstid|XA2  |Ambulans2|JCe       
Pgk |2022-11-24|tor|10:15|PgkResurstid|C1.01|Alfa     |AGh       
Pgk |2022-11-24|tor|10:15|PgkResurstid|C1.02|Beta     |NAn       
Pgk |2022-11-24|tor|10:15|PgkResurstid|C1.03|Gamma    |NSa       
Pgk |2022-11-24|tor|10:15|PgkResurstid|XAO  |Ambulans1|AGr       
Pgk |2022-11-24|tor|10:15|PgkResurstid|XA2  |Ambulans2|JCe       
Pgk |2022-11-24|tor|13:15|PgkResurstid|D1.11|Falk     |PSj       
Pgk |2022-11-24|tor|13:15|PgkResurstid|D1.12|Jupiter  |ANi       
Pgk |2022-11-24|tor|13:15|PgkResurstid|D1.13|Panter   |JHa       
Pgk |2022-11-24|tor|13:15|PgkResurstid|D1.14|Saturnus |FKa       
Pgk |2022-11-24|tor|13:15|PgkResurstid|W3   |Varg     |NAn       
Pgk |2022-11-24|tor|13:15|PgkResurstid|XAO  |Ambulans1|JCe       
Pgk |2022-11-24|tor|13:15|PgkResurstid|XA2  |Ambulans2|ECe       
Pgk |2022-11-24|tor|15:15|PgkResurstid|C1.04|Panter   |JTh       
Pgk |2022-11-24|tor|15:15|PgkResurstid|C1.05|Val      |APh       
Pgk |2022-11-24|tor|15:15|PgkResurstid|C1.06|Varg     |ESt       
Pgk |2022-11-24|tor|15:15|PgkResurstid|XAO  |Ambulans1|FKa       
Pgk |2022-11-24|tor|15:15|PgkResurstid|XA2  |Ambulans2|ECe       
Pgk |2022-11-25|fre|08:15|PgkLabb     |D1.01|Beta     |EBk       
Pgk |2022-11-25|fre|08:15|PgkLabb     |D1.02|Jupiter  |HLi       
Pgk |2022-11-25|fre|08:15|PgkLabb     |D1.03|Mars     |JSw       
Pgk |2022-11-25|fre|08:15|PgkLabb     |D1.04|Panter   |PGy       
Pgk |2022-11-25|fre|08:15|PgkLabb     |D1.05|Saturnus |JHa       
Pgk |2022-11-25|fre|08:15|PgkLabb     |D1.06|Val      |ECe       
Pgk |2022-11-25|fre|08:15|PgkLabb     |D1.07|Varg     |OLe       
Pgk |2022-11-25|fre|08:15|PgkLabb     |XAO  |Ambulans |HPe       
Pgk |2022-11-25|fre|08:15|PgkLabb     |XA2  |Ambulans |AGh       
Pgk |2022-11-25|fre|13:15|PgkLabb     |D1.08|Alfa     |DHe       
Pgk |2022-11-25|fre|13:15|PgkLabb     |D1.09|Beta     |ASa       
Pgk |2022-11-25|fre|13:15|PgkLabb     |D1.10|Gamma    |AGh       
Pgk |2022-11-25|fre|13:15|PgkLabb     |D1.11|Jupiter  |HLi       
Pgk |2022-11-25|fre|13:15|PgkLabb     |D1.12|Mars     |EBk       
Pgk |2022-11-25|fre|13:15|PgkLabb     |D1.13|Panter   |HPe       
Pgk |2022-11-25|fre|13:15|PgkLabb     |D1.14|Saturnus |ANi       
Pgk |2022-11-25|fre|13:15|PgkLabb     |W3   |Varg     |NAn       
Pgk |2022-11-25|fre|13:15|PgkLabb     |XAO  |Ambulans1|LLi       
Pgk |2022-11-25|fre|13:15|PgkLabb     |XA2  |Ambulans2|MWi       
Pgk |2022-11-25|fre|13:15|PgkLabb     |XA3  |Ambulans3|PSj       
Pgk |2022-11-25|fre|15:15|PgkLabb     |C1.01|Elg      |AGh       
Pgk |2022-11-25|fre|15:15|PgkLabb     |C1.02|Falk     |NAn       
Pgk |2022-11-25|fre|15:15|PgkLabb     |C1.03|Hacke    |HLi       
Pgk |2022-11-25|fre|15:15|PgkLabb     |C1.04|Panter   |HPe       
Pgk |2022-11-25|fre|15:15|PgkLabb     |C1.05|Val      |APh       
Pgk |2022-11-25|fre|15:15|PgkLabb     |C1.06|Varg     |ESt       
Pgk |2022-11-25|fre|15:15|PgkLabb     |XAO  |Ambulans1|LLi       
Pgk |2022-11-25|fre|15:15|PgkLabb     |XA2  |Ambulans2|MWi       
Pgk |2022-11-25|fre|15:15|PgkLabb     |XA3  |Ambulans3|OBe       
Pgk |2022-11-30|ons|13:15|PgkResurstid|D1.01|Alfa     |EBk       
Pgk |2022-11-30|ons|13:15|PgkResurstid|D1.02|Beta     |JCe       
Pgk |2022-11-30|ons|13:15|PgkResurstid|D1.03|Gamma    |HLi       
Pgk |2022-11-30|ons|13:15|PgkResurstid|D1.04|Jupiter  |PGy       
Pgk |2022-11-30|ons|13:15|PgkResurstid|D1.05|Mars     |JHa       
Pgk |2022-11-30|ons|13:15|PgkResurstid|XAO  |Ambulans1|ESt       
Pgk |2022-11-30|ons|13:15|PgkResurstid|XA2  |Ambulans2|ECe       
Pgk |2022-11-30|ons|15:15|PgkResurstid|D1.06|Alfa     |ECe       
Pgk |2022-11-30|ons|15:15|PgkResurstid|D1.07|Beta     |EDa       
Pgk |2022-11-30|ons|15:15|PgkResurstid|D1.08|Falk     |DHe       
Pgk |2022-11-30|ons|15:15|PgkResurstid|D1.09|Gamma    |ASa       
Pgk |2022-11-30|ons|15:15|PgkResurstid|D1.10|Hacke    |AGr       
Pgk |2022-11-30|ons|15:15|PgkResurstid|XAO  |Ambulans1|HPe       
Pgk |2022-11-30|ons|15:15|PgkResurstid|XA2  |Ambulans2|HLi       
Pgk |2022-12-01|tor|10:15|PgkResurstid|C1.01|Alfa     |AGh       
Pgk |2022-12-01|tor|10:15|PgkResurstid|C1.02|Beta     |NAn       
Pgk |2022-12-01|tor|10:15|PgkResurstid|C1.03|Gamma    |NSa       
Pgk |2022-12-01|tor|10:15|PgkResurstid|XAO  |Ambulans1|JCe       
Pgk |2022-12-01|tor|10:15|PgkResurstid|XA2  |Ambulans2|FKa       
Pgk |2022-12-01|tor|13:15|PgkResurstid|D1.11|Falk     |PSj       
Pgk |2022-12-01|tor|13:15|PgkResurstid|D1.12|Jupiter  |ANi       
Pgk |2022-12-01|tor|13:15|PgkResurstid|D1.13|Panter   |OBe       
Pgk |2022-12-01|tor|13:15|PgkResurstid|D1.14|Saturnus |FKa       
Pgk |2022-12-01|tor|13:15|PgkResurstid|W3   |Varg     |NAn       
Pgk |2022-12-01|tor|13:15|PgkResurstid|XAO  |Ambulans1|DHe       
Pgk |2022-12-01|tor|13:15|PgkResurstid|XA2  |Ambulans2|APh       
Pgk |2022-12-01|tor|15:15|PgkResurstid|C1.04|Panter   |JTh       
Pgk |2022-12-01|tor|15:15|PgkResurstid|C1.05|Val      |APh       
Pgk |2022-12-01|tor|15:15|PgkResurstid|C1.06|Varg     |ESt       
Pgk |2022-12-01|tor|15:15|PgkResurstid|XAO  |Ambulans1|FKa       
Pgk |2022-12-01|tor|15:15|PgkResurstid|XA2  |Ambulans2|ECe       
Pgk |2022-12-02|fre|08:15|PgkLabb     |D1.01|Beta     |EBk       
Pgk |2022-12-02|fre|08:15|PgkLabb     |D1.02|Jupiter  |JCe       
Pgk |2022-12-02|fre|08:15|PgkLabb     |D1.03|Mars     |JSw       
Pgk |2022-12-02|fre|08:15|PgkLabb     |D1.04|Panter   |PGy       
Pgk |2022-12-02|fre|08:15|PgkLabb     |D1.05|Saturnus |JHa       
Pgk |2022-12-02|fre|08:15|PgkLabb     |D1.06|Val      |ECe       
Pgk |2022-12-02|fre|08:15|PgkLabb     |D1.07|Varg     |ANi       
Pgk |2022-12-02|fre|08:15|PgkLabb     |XAO  |Ambulans |OLe       
Pgk |2022-12-02|fre|08:15|PgkLabb     |XA2  |Ambulans |AGh       
Pgk |2022-12-02|fre|13:15|PgkLabb     |D1.08|Alfa     |DHe       
Pgk |2022-12-02|fre|13:15|PgkLabb     |D1.09|Beta     |ASa       
Pgk |2022-12-02|fre|13:15|PgkLabb     |D1.10|Gamma    |ESt       
Pgk |2022-12-02|fre|13:15|PgkLabb     |D1.11|Jupiter  |JCe       
Pgk |2022-12-02|fre|13:15|PgkLabb     |D1.12|Mars     |EBk       
Pgk |2022-12-02|fre|13:15|PgkLabb     |D1.13|Panter   |PSj       
Pgk |2022-12-02|fre|13:15|PgkLabb     |D1.14|Saturnus |AGh       
Pgk |2022-12-02|fre|13:15|PgkLabb     |W3   |Varg     |NAn       
Pgk |2022-12-02|fre|13:15|PgkLabb     |XAO  |Ambulans1|MKl       
Pgk |2022-12-02|fre|13:15|PgkLabb     |XA2  |Ambulans2|TLu       
Pgk |2022-12-02|fre|13:15|PgkLabb     |XA3  |Ambulans3|OPe       
Pgk |2022-12-02|fre|15:15|PgkLabb     |C1.01|Elg      |AGh       
Pgk |2022-12-02|fre|15:15|PgkLabb     |C1.02|Falk     |NAn       
Pgk |2022-12-02|fre|15:15|PgkLabb     |C1.03|Hacke    |NSa       
Pgk |2022-12-02|fre|15:15|PgkLabb     |C1.04|Panter   |JTh       
Pgk |2022-12-02|fre|15:15|PgkLabb     |C1.05|Val      |APh       
Pgk |2022-12-02|fre|15:15|PgkLabb     |C1.06|Varg     |ESt       
Pgk |2022-12-02|fre|15:15|PgkLabb     |XAO  |Ambulans1|DHe       
Pgk |2022-12-02|fre|15:15|PgkLabb     |XA2  |Ambulans2|MWi       
Pgk |2022-12-02|fre|15:15|PgkLabb     |XA3  |Ambulans3|PSj       
Pgk |2022-12-07|ons|13:15|PgkResurstid|D1.01|Alfa     |EBk       
Pgk |2022-12-07|ons|13:15|PgkResurstid|D1.02|Beta     |JCe       
Pgk |2022-12-07|ons|13:15|PgkResurstid|D1.03|Gamma    |ANi       
Pgk |2022-12-07|ons|13:15|PgkResurstid|D1.04|Jupiter  |PGy       
Pgk |2022-12-07|ons|13:15|PgkResurstid|D1.05|Mars     |JHa       
Pgk |2022-12-07|ons|13:15|PgkResurstid|XAO  |Ambulans1|ESt       
Pgk |2022-12-07|ons|13:15|PgkResurstid|XA2  |Ambulans2|FKa       
Pgk |2022-12-07|ons|15:15|PgkResurstid|D1.06|Alfa     |ECe       
Pgk |2022-12-07|ons|15:15|PgkResurstid|D1.07|Beta     |EDa       
Pgk |2022-12-07|ons|15:15|PgkResurstid|D1.08|Falk     |DHe       
Pgk |2022-12-07|ons|15:15|PgkResurstid|D1.09|Gamma    |ASa       
Pgk |2022-12-07|ons|15:15|PgkResurstid|D1.10|Hacke    |AGr       
Pgk |2022-12-07|ons|15:15|PgkResurstid|XAO  |Ambulans1|EBk       
Pgk |2022-12-07|ons|15:15|PgkResurstid|XA2  |Ambulans2|JCe       
Pgk |2022-12-08|tor|10:15|PgkResurstid|C1.01|Alfa     |AGh       
Pgk |2022-12-08|tor|10:15|PgkResurstid|C1.02|Beta     |NAn       
Pgk |2022-12-08|tor|10:15|PgkResurstid|C1.03|Gamma    |NSa       
Pgk |2022-12-08|tor|10:15|PgkResurstid|XAO  |Ambulans1|HPe       
Pgk |2022-12-08|tor|10:15|PgkResurstid|XA2  |Ambulans2|AGr       
Pgk |2022-12-08|tor|13:15|PgkResurstid|D1.11|Falk     |HLi       
Pgk |2022-12-08|tor|13:15|PgkResurstid|D1.12|Jupiter  |OBe       
Pgk |2022-12-08|tor|13:15|PgkResurstid|D1.13|Panter   |HPe       
Pgk |2022-12-08|tor|13:15|PgkResurstid|D1.14|Saturnus |FKa       
Pgk |2022-12-08|tor|13:15|PgkResurstid|W3   |Varg     |NAn       
Pgk |2022-12-08|tor|13:15|PgkResurstid|XAO  |Ambulans1|PGy       
Pgk |2022-12-08|tor|13:15|PgkResurstid|XA2  |Ambulans2|ESt       
Pgk |2022-12-08|tor|15:15|PgkResurstid|C1.04|Panter   |JTh       
Pgk |2022-12-08|tor|15:15|PgkResurstid|C1.05|Val      |APh       
Pgk |2022-12-08|tor|15:15|PgkResurstid|C1.06|Varg     |ESt       
Pgk |2022-12-08|tor|15:15|PgkResurstid|XAO  |Ambulans1|ECe       
Pgk |2022-12-08|tor|15:15|PgkResurstid|XA2  |Ambulans2|EBk       
Pgk |2022-12-09|fre|08:15|PgkLabb     |D1.01|Beta     |EBk       
Pgk |2022-12-09|fre|08:15|PgkLabb     |D1.02|Jupiter  |JCe       
Pgk |2022-12-09|fre|08:15|PgkLabb     |D1.03|Mars     |JSw       
Pgk |2022-12-09|fre|08:15|PgkLabb     |D1.04|Panter   |PGy       
Pgk |2022-12-09|fre|08:15|PgkLabb     |D1.05|Saturnus |JHa       
Pgk |2022-12-09|fre|08:15|PgkLabb     |D1.06|Val      |ECe       
Pgk |2022-12-09|fre|08:15|PgkLabb     |D1.07|Varg     |ANi       
Pgk |2022-12-09|fre|08:15|PgkLabb     |XAO  |Ambulans |OLe       
Pgk |2022-12-09|fre|08:15|PgkLabb     |XA2  |Ambulans |AGh       
Pgk |2022-12-09|fre|13:15|PgkLabb     |D1.08|Alfa     |DHe       
Pgk |2022-12-09|fre|13:15|PgkLabb     |D1.09|Beta     |ASa       
Pgk |2022-12-09|fre|13:15|PgkLabb     |D1.10|Gamma    |EBk       
Pgk |2022-12-09|fre|13:15|PgkLabb     |D1.11|Jupiter  |HLi       
Pgk |2022-12-09|fre|13:15|PgkLabb     |D1.12|Mars     |OBe       
Pgk |2022-12-09|fre|13:15|PgkLabb     |D1.13|Panter   |HPe       
Pgk |2022-12-09|fre|13:15|PgkLabb     |D1.14|Saturnus |ANi       
Pgk |2022-12-09|fre|13:15|PgkLabb     |W3   |Varg     |NAn       
Pgk |2022-12-09|fre|13:15|PgkLabb     |XAO  |Ambulans1|LLi       
Pgk |2022-12-09|fre|13:15|PgkLabb     |XA2  |Ambulans2|ESt       
Pgk |2022-12-09|fre|13:15|PgkLabb     |XA3  |Ambulans3|AGh       
Pgk |2022-12-09|fre|15:15|PgkLabb     |C1.01|Elg      |AGh       
Pgk |2022-12-09|fre|15:15|PgkLabb     |C1.02|Falk     |NAn       
Pgk |2022-12-09|fre|15:15|PgkLabb     |C1.03|Hacke    |NSa       
Pgk |2022-12-09|fre|15:15|PgkLabb     |C1.04|Panter   |JTh       
Pgk |2022-12-09|fre|15:15|PgkLabb     |C1.05|Val      |APh       
Pgk |2022-12-09|fre|15:15|PgkLabb     |C1.06|Varg     |ESt       
Pgk |2022-12-09|fre|15:15|PgkLabb     |XAO  |Ambulans1|HPe       
Pgk |2022-12-09|fre|15:15|PgkLabb     |XA2  |Ambulans2|HLi       
Pgk |2022-12-09|fre|15:15|PgkLabb     |XA3  |Ambulans3|OBe       
Pgk |2022-12-14|ons|13:15|PgkResurstid|D1.01|Alfa     |EBk       
Pgk |2022-12-14|ons|13:15|PgkResurstid|D1.02|Beta     |JCe       
Pgk |2022-12-14|ons|13:15|PgkResurstid|D1.03|Gamma    |HPe       
Pgk |2022-12-14|ons|13:15|PgkResurstid|D1.04|Jupiter  |PGy       
Pgk |2022-12-14|ons|13:15|PgkResurstid|D1.05|Mars     |ANi       
Pgk |2022-12-14|ons|13:15|PgkResurstid|XAO  |Ambulans1|OBe       
Pgk |2022-12-14|ons|13:15|PgkResurstid|XA2  |Ambulans2|AGh       
Pgk |2022-12-14|ons|15:15|PgkResurstid|D1.06|Alfa     |ECe       
Pgk |2022-12-14|ons|15:15|PgkResurstid|D1.07|Beta     |EDa       
Pgk |2022-12-14|ons|15:15|PgkResurstid|D1.08|Falk     |DHe       
Pgk |2022-12-14|ons|15:15|PgkResurstid|D1.09|Gamma    |ASa       
Pgk |2022-12-14|ons|15:15|PgkResurstid|D1.10|Hacke    |AGr       
Pgk |2022-12-14|ons|15:15|PgkResurstid|XAO  |Ambulans1|AGh       
Pgk |2022-12-14|ons|15:15|PgkResurstid|XA2  |Ambulans2|JCe       
Pgk |2022-12-15|tor|10:15|PgkResurstid|C1.01|Alfa     |AGh       
Pgk |2022-12-15|tor|10:15|PgkResurstid|C1.02|Beta     |NAn       
Pgk |2022-12-15|tor|10:15|PgkResurstid|C1.03|Gamma    |AGr       
Pgk |2022-12-15|tor|10:15|PgkResurstid|XAO  |Ambulans1|JCe       
Pgk |2022-12-15|tor|10:15|PgkResurstid|XA2  |Ambulans2|ECe       
Pgk |2022-12-15|tor|13:15|PgkResurstid|D1.11|Falk     |HLi       
Pgk |2022-12-15|tor|13:15|PgkResurstid|D1.12|Jupiter  |PSj       
Pgk |2022-12-15|tor|13:15|PgkResurstid|D1.13|Panter   |HPe       
Pgk |2022-12-15|tor|13:15|PgkResurstid|D1.14|Saturnus |FKa       
Pgk |2022-12-15|tor|13:15|PgkResurstid|W3   |Varg     |NAn       
Pgk |2022-12-15|tor|13:15|PgkResurstid|XAO  |Ambulans1|DHe       
Pgk |2022-12-15|tor|13:15|PgkResurstid|XA2  |Ambulans2|ESt       
Pgk |2022-12-15|tor|15:15|PgkResurstid|C1.04|Panter   |JTh       
Pgk |2022-12-15|tor|15:15|PgkResurstid|C1.05|Val      |APh       
Pgk |2022-12-15|tor|15:15|PgkResurstid|C1.06|Varg     |ESt       
Pgk |2022-12-15|tor|15:15|PgkResurstid|XAO  |Ambulans1|AGh       
Pgk |2022-12-15|tor|15:15|PgkResurstid|XA2  |Ambulans2|JCe       
""".trim.split('\n').toSeq