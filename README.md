# OpenTT-Documents

More languages see below.

## Deutsch

Teil des Projekts "OpenTT", offene Dokumente und Programme rund um Tischtennis.

Dieser Teil enthält Dokumente: Regeln, Handbücher, Regelfragen etc.

Lizenz: Creative-Commons-Lizenz Namensnennung - Nicht-kommerziell - Weitergabe unter gleichen Bedingungen 4.0 International

Siehe Datei LICENSE.

### Was soll das? Kann ich mitmachen?

Ich will schöne Dokumente vielfältig zur Verfügung stellen.
Die Dokumente können in verschiedene Formate umgewandelt werden kann, z.B. als PDF-Datei, HTML oder App.
Dafür werden die Dokumente in XML geschrieben und dann umgewandelt.

*XML* habe ich gewählt, da man die Daten so einfach und ohne Datenbankserver speichern und verarbeiten kann.
Ich muss noch sehen, inwieweit der Ansatz trägt.

Die Daten sollen mehrsprachig hinterlegt werden bzw. nutzbar sein.

Mitmachen kann jede_r, Aufgaben kann ich noch nicht festlegen.
Es wird viel um Übersetzung gehen, vermute ich.

### Technische Details

#### Benötigte Programme

Editieren

- Editor Ihrer Wahl, muss UTF-8 können

Multimarkdown

- Multimarkdown-Programm von http://fletcherpenney.net/multimarkdown/

LaTeX

- LaTeX-Distribution (z.B. MiKTeX http://www.miktex.org/ oder TeXLive http://www.tug.org/texlive/)
- Basis-Stil von https://github.com/ekleinod/basis

Ant

- zur Automatisierung der Dokumenterzeugung von http://ant.apache.org/

#### Git-Repository

Kurze Details zum Aufbau des Git-Repositories:
Die Aufteilung in Zweige orientiert sich am Git-Branching-Modell, das in http://nvie.com/posts/a-successful-git-branching-model/ beschrieben wird.

Das heißt, es gibt immer mindestens drei Zweige:

1. `master` - enthält nur fertige Versionen
2. `develop` - Hauptzweig, gegen den entwickelt wird, dient der Synchronisation der feature-, release- und hotfix-Zweige
3. `feature-work` - Haupt-Arbeitszweig, in dem standardmäßig geschrieben wird

Zusätzlich werden bei Bedarf folgende Zweige genutzt:

- `feature-*` - für das Schreiben eines bestimmten Features/Textteils
- `release-*` - Synchronisation fertiger Versionen zwischen `develop` und `master`
- `hotfix-*` - schnelle Fehlerbehebung

## English

Part of the project "OpenTT" which provides open documents and applications for table tennis.

This part contains documents: rules, handbooks, rule questions etc.

License: Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License

See file LICENSE.

### What is this? Can I participate?

I want to provide nice documents in various ways.
The documents can be produced in different formats, e.g. as pdf file, HTML or app.
The documents are written in XML and converted afterwards.

I chose *XML* in order to store and convert data easy and without a database server.
I have to see, if this is a successful approach.

The data must be stored and used multilingual.

Everybody can participate, at the moment I don't have special tasks.
There will be a lot of translation, I presume.

### Technical details

#### Needed programs

Editing

- editor of your choice, has to be able to handle UTF-8

Multimarkdown

- Multimarkdown program from http://fletcherpenney.net/multimarkdown/

LaTeX

- LaTeX distribution (e.g. MiKTeX http://www.miktex.org/ or TeXLive http://www.tug.org/texlive/)
- Basis style from https://github.com/ekleinod/basis

Ant

- for automatization of document generation from http://ant.apache.org/

#### Git repository

Short details about the structure of the git repository:
The branches are constructed regarding the git branching model of http://nvie.com/posts/a-successful-git-branching-model/

This means, there are always at least three branches:

1. `master` - contains released versions
2. `develop` - main synchronisation branch for feature, release, and hotfix branches
3. `feature-work` - main wirking branch for development

Additionally, the following branches my occur:

- `feature-*` - writing a special feature
- `release-*` - synchronizing release versions between `develop` and `master`
- `hotfix-*` - fast bugfixes

