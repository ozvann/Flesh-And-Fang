# Flesh And Fang — RPG au tour par tour

## 📖 Présentation

Ce projet consiste à créer un **RPG de collection et de chasse aux créatures**, inspiré dans sa structure des jeux de type *Pokémon*, mais avec une différence fondamentale :

> **Le joueur ne capture jamais les créatures. Il les affronte directement, les chasse et peut récupérer leur corps et leurs différentes parties afin de fabriquer des armes et équipements.**

Le personnage principal est donc lui-même le combattant.

Les créatures ne sont pas utilisées comme combattants par le joueur. Elles constituent plutôt une partie essentielle de l'écosystème du monde et une source de matériaux permettant au joueur de devenir plus puissant.

---

# 🎮 Concept général

Le joueur évolue dans un monde rempli de créatures possédant différentes caractéristiques, capacités et comportements.

Lorsqu'une créature est rencontrée, un **combat au tour par tour** commence.

Contrairement à Pokémon :

* le joueur combat directement ;
* le joueur possède ses propres statistiques ;
* le joueur utilise des armes et compétences ;
* les créatures attaquent directement le joueur ;
* aucune créature n'est capturée ;
* une créature vaincue peut être dépouillée de différents matériaux ;
* ces matériaux peuvent servir à fabriquer et améliorer des armes.

### Boucle de gameplay principale

```text
       EXPLORATION
           │
           ▼
      RENCONTRE D'UNE
        CRÉATURE
           │
           ▼
     COMBAT AU TOUR
        PAR TOUR
           │
           ▼
     CRÉATURE VAINCUE
           │
           ▼
     RÉCUPÉRATION DES
        MATÉRIAUX
           │
           ▼
       FABRICATION
        D'ARMES
           │
           ▼
      AMÉLIORATION DU
        PERSONNAGE
           │
           ▼
        EXPLORATION
```

---

# ⚔️ Système de combat

Les combats sont **au tour par tour**.

Le système doit conserver une partie de la simplicité et de la lisibilité des combats de Pokémon, tout en étant adapté à un personnage humain utilisant des armes.

## Exemple

```text
┌─────────────────────────────────────┐
│             VOLTOU                  │
│                                     │
│        PV : ███████░░░ 72%          │
│        Niveau : 12                  │
└─────────────────────────────────────┘


┌─────────────────────────────────────┐
│             JOUEUR                  │
│                                     │
│        PV : █████████░ 87%          │
│        Niveau : 10                  │
└─────────────────────────────────────┘


        Que voulez-vous faire ?

        > Attaquer
          Défendre
          Objet
          Équipement
          Fuir
```

Le joueur choisit une action.

L'ordre des actions dépendra notamment de statistiques telles que la vitesse, les effets des compétences ou les caractéristiques de l'équipement.

---

# 🧍 Personnage principal

Le personnage principal est le combattant principal du jeu.

Il possède notamment :

* des points de vie ;
* des statistiques ;
* un niveau ;
* des armes ;
* des équipements ;
* des compétences ;
* des consommables ;
* des effets temporaires ou permanents.

Contrairement aux jeux de capture de créatures, **la progression du personnage est directement liée à son équipement et aux matériaux qu'il récupère**.

---

# 🗡️ Armes

Les armes constituent une partie importante de la progression.

Le joueur pourra utiliser différents types d'armes.

Exemples :

* épée ;
* lance ;
* arc ;
* marteau ;
* arme à feu ;
* arme électrique ;
* arme de glace ;
* arme empoisonnée ;
* etc.

Les armes peuvent posséder :

* des dégâts ;
* une précision ;
* une vitesse ;
* un type élémentaire ;
* des effets secondaires ;
* des compétences ;
* un niveau d'amélioration.

---

# 🧬 Créatures

Les créatures sont au cœur du monde.

Chaque créature peut avoir :

* un nom ;
* un niveau ;
* des points de vie ;
* des statistiques ;
* un ou plusieurs types ;
* des attaques ;
* des capacités spéciales ;
* des matériaux récupérables ;
* une rareté ;
* un habitat spécifique ;
* un comportement particulier.

Les créatures ne sont **jamais capturées par le joueur**.

Elles sont uniquement rencontrées, combattues et éventuellement exploitées comme ressources.

---

# ☠️ Mort des créatures

Lorsqu'une créature est vaincue, elle peut laisser différents matériaux.

Une même créature peut fournir plusieurs types de ressources.

### Exemple

Une créature électrique appelée **Voltou** pourrait fournir :

```text
Voltou vaincu

├── Organe électrique
├── Crocs
├── Griffes
├── Peau conductrice
└── Cœur électrique
```

Ces composants peuvent ensuite être utilisés dans le système de fabrication.

---

# 🔧 Fabrication

Les matériaux récupérés permettent au joueur de créer et améliorer son équipement.

### Exemple

```text
Organe électrique
       +
Métal
       +
Câble
       ↓
      TASER
```

Ou :

```text
Griffe de Voltou
       +
Métal
       ↓
DAGUE ÉLECTRIQUE
```

Chaque créature peut donc être intéressante à chasser pour des raisons différentes.

---

# ⚡ Exemple de créature

## Voltou

**Type :** Électricité
**Habitat :** Forêts / zones orageuses

### Capacités

* Décharge
* Éclair
* Paralysie
* Charge électrique

### Matériaux

| Matériau          | Utilisation                  |
| ----------------- | ---------------------------- |
| Organe électrique | Armes électriques            |
| Griffe            | Armes rapides                |
| Peau conductrice  | Armures                      |
| Cœur électrique   | Batteries / armes puissantes |
| Croc              | Armes de mêlée               |

### Exemple d'armes

**Taser de Voltou**

```text
Dégâts : 25
Type : Électricité
Effet : Chance de paralysie
Portée : Courte
```

**Dague de Voltou**

```text
Dégâts : 35
Type : Électricité
Vitesse : Élevée
Effet : Dégâts électriques supplémentaires
```

---

# 🎒 Inventaire

Le joueur possède un inventaire permettant de stocker :

* armes ;
* équipements ;
* matériaux ;
* objets de soin ;
* objets de combat ;
* ressources diverses.

La gestion de l'inventaire devra rester suffisamment simple pour ne pas interrompre constamment l'exploration.

---

# 🧪 Types et éléments

Les créatures et les armes peuvent posséder différents types élémentaires.

Exemples :

* 🔥 Feu
* 💧 Eau
* ⚡ Électricité
* ❄️ Glace
* 🌪️ Vent
* 🪨 Terre
* ☠️ Poison
* 🌑 Ombre
* ✨ Lumière
* ⚔️ Physique

Les interactions entre les types devront créer une véritable stratégie pendant les combats.

Par exemple :

```text
Feu > Glace
Eau > Feu
Terre > Électricité
Glace > Eau
```

Le système exact des avantages et désavantages sera défini ultérieurement.

---

# 🧑‍🤝‍🧑 Dresseurs / autres humains

Le monde contient également des personnages humains capables de combattre le joueur.

Cependant, ils ne commandent pas des créatures pendant les combats.

Ils combattent **directement le joueur**.

Exemple :

```text
DRESSEUR RIVAL

PV : ████████░░
Arme : Arc
Niveau : 15

        VS

JOUEUR

PV : █████████░
Arme : Épée
Niveau : 14
```

Les combats contre les humains utilisent donc le même système de combat au tour par tour que les combats contre les créatures.

---

# 🗺️ Monde

Le jeu devra proposer un monde explorable composé de différentes zones.

Chaque zone possède ses propres créatures et ressources.

Exemples :

* forêt ;
* montagne ;
* désert ;
* marais ;
* grotte ;
* zone volcanique ;
* zone enneigée ;
* ruines ;
* ville ;
* zones dangereuses.

Certaines ressources rares ne pourront être obtenues que dans certaines régions.

---

# 📈 Progression

La progression du joueur repose sur plusieurs éléments.

### Niveau du personnage

Le personnage gagne de l'expérience et peut augmenter de niveau.

### Équipement

Le joueur peut améliorer :

* ses armes ;
* son armure ;
* ses accessoires ;
* ses compétences.

### Fabrication

Les matériaux récupérés permettent de fabriquer de nouveaux équipements.

### Exploration

Certaines zones deviennent accessibles lorsque le joueur devient suffisamment puissant ou possède l'équipement nécessaire.

---

# 🎯 Objectif du joueur

L'objectif principal du joueur reste à définir.

Plusieurs possibilités sont envisageables :

* explorer le monde ;
* découvrir toutes les créatures ;
* devenir le meilleur chasseur ;
* vaincre différents chefs / boss ;
* découvrir l'origine des créatures ;
* résoudre un conflit entre humains et créatures ;
* découvrir pourquoi les créatures deviennent de plus en plus dangereuses ;
* atteindre une zone interdite ;
* vaincre un adversaire final.

L'histoire pourra être définie séparément.

---

# 🎨 Direction artistique

La direction artistique reste à définir.

Le jeu devra cependant avoir une identité propre et ne pas chercher à reproduire directement l'apparence de Pokémon.

Les créatures, personnages, armes, villes et environnements devront être originaux.

---

# ⚠️ Inspiration et propriété intellectuelle

Le projet s'inspire de plusieurs concepts existants, notamment :

* RPG au tour par tour ;
* jeux de collection de créatures ;
* systèmes de types élémentaires ;
* exploration ;
* progression par niveaux ;
* fabrication d'équipement.

Cependant, le projet ne doit pas utiliser directement les éléments protégés de Pokémon.

### Ne pas utiliser

* Pokémon ;
* Pikachu ;
* Poké Balls ;
* noms officiels ;
* personnages Pokémon ;
* designs Pokémon ;
* logos ;
* musiques ;
* sprites ;
* modèles 3D ;
* dialogues ;
* histoire ;
* assets extraits des jeux Pokémon.

L'objectif est de créer **un univers original utilisant des mécaniques de jeu similaires, mais avec sa propre identité**.

---

# 🧠 Principes de conception

Le projet doit respecter plusieurs principes.

### 1. Le joueur est le combattant

Les créatures ne combattent jamais à la place du joueur.

### 2. Pas de capture

Il n'existe aucun système permettant de capturer une créature pour la conserver comme combattant.

### 3. Les créatures sont des ressources

Les créatures peuvent fournir des matériaux utilisés pour fabriquer des équipements.

### 4. Combat au tour par tour

Les combats doivent rester stratégiques et lisibles.

### 5. Chaque créature doit avoir une utilité

Une créature faible peut quand même fournir un matériau important.

### 6. L'équipement doit influencer le gameplay

Le choix de l'arme doit modifier la manière de jouer.

### 7. Le monde doit encourager l'exploration

Les nouvelles régions doivent apporter de nouvelles créatures, ressources et équipements.

---

# 🔄 Boucle de gameplay

La boucle principale du jeu peut être résumée ainsi :

```text
        EXPLORER
           ↓
       RENCONTRER
       UNE CRÉATURE
           ↓
       COMBATTRE
       AU TOUR PAR TOUR
           ↓
       VAINCRE
           ↓
      RÉCUPÉRER LES
        MATÉRIAUX
           ↓
        FABRIQUER
           ↓
       AMÉLIORER SON
        PERSONNAGE
           ↓
    ACCÉDER À DE NOUVELLES
          ZONES
           ↓
      NOUVELLES CRÉATURES
           ↓
           ↺
```

---

# 🚧 Éléments encore à définir

Les éléments suivants devront être décidés pendant le développement :

* [ ] Nom définitif du jeu
* [ ] Nom du monde
* [ ] Direction artistique
* [ ] Moteur de jeu
* [ ] Plateformes ciblées
* [ ] Nombre de créatures
* [ ] Types élémentaires
* [ ] Système de statistiques
* [ ] Système de combat détaillé
* [ ] Système de fabrication
* [ ] Types d'armes
* [ ] Système d'expérience
* [ ] Système de niveaux
* [ ] Système de butin
* [ ] Système d'inventaire
* [ ] Système d'amélioration
* [ ] Structure du monde
* [ ] Histoire
* [ ] Personnages principaux
* [ ] Boss
* [ ] Quêtes
* [ ] Musiques
* [ ] Effets sonores
* [ ] Interface utilisateur
* [ ] Sauvegarde
* [ ] Système de difficulté

---

# 🛠️ Développement

Le développement devra être réalisé progressivement.

Il est préférable de commencer par un **prototype minimal** plutôt que de développer immédiatement le jeu complet.

## Premier prototype

Le premier prototype devrait uniquement contenir :

```text
1 personnage
      ↓
1 créature
      ↓
Combat au tour par tour
      ↓
Victoire / défaite
      ↓
Récompense
```

Une fois cette boucle fonctionnelle, les systèmes pourront être ajoutés progressivement :

```text
Combat
 ↓
Statistiques
 ↓
Armes
 ↓
Butin
 ↓
Fabrication
 ↓
Inventaire
 ↓
Progression
 ↓
Créatures supplémentaires
 ↓
Monde
 ↓
Quêtes
 ↓
Histoire
```

---

# 🌟 Vision du projet

L'objectif final est de créer un jeu qui donne au joueur la sensation de :

> **« Je parcours un monde rempli de créatures, je les affronte moi-même, je récupère ce qu'elles ont de particulier et je transforme leurs caractéristiques en armes pour devenir progressivement plus puissant. »**

Le jeu doit conserver le côté **stratégique et accessible du RPG au tour par tour**, tout en proposant une boucle de gameplay basée sur la **chasse, le butin, la fabrication et l'évolution de l'équipement**.

Le résultat recherché est un mélange entre :

**RPG au tour par tour + chasse aux créatures + crafting + exploration + progression d'équipement.**

