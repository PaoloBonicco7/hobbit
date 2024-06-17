# Notes 

## GIT:

### Command List:

* git add "filename.file" ~ *add a file to staging area*
* git add -p "filename.file" ~ *to add only part of the file*
* git status ~ *to see what is in the staging area*
* git branch "branch_name" ~ *to create a new branch*
* git checkout "branch_name" ~ *to switch to a branch*
* git push --set-upstream origin "branch_name" ~ *to push a new branch to the remote*
* git merge branch_name ~ *to merge a branch into the current branch (main)*

You can always UNDO a merge conflit and return to the previous state by using:

* git merge --abort ~ *to abort a merge, in pratica fa tornare allo stato precedente al merge, in modo che 
  si possa effettuare alcune modifiche al codice per evitare conflitti.* 
* git rebase --abort ~ *to abort a rebase*

### GitFlow: 

**git flow *cmd* help**

* git flow init ~ *to initialize git flow*
* git flow feature start "feature_name" ~ *to create a new feature branch*
* git flow feature finish "feature_name" ~ *to merge a feature branch into the develop branch*
* git flow release start "release_name" ~ *to create a new release branch*
* git flow release finish "release_name" ~ *to merge a release branch into the main branch*
* git flow hotfix start "hotfix_name" ~ *to create a new hotfix branch*
* git flow hotfix finish "hotfix_name" ~ *to merge a hotfix branch into the main branch*

Differenze tra merge e rebase:
* git merge ~ *mergea il branch corrente con il branch specificato, creando un nuovo commit*
* git rebase ~ *rebasea il branch corrente con il branch specificato, applicando i commit del branch specificato
  uno per uno sul branch corrente, senza creare un nuovo commit*

**WARNING**

Do not use Rebase on commits that you've already pushed/shared on a remote repository.

## Annotations:
@Transactional ~ *to make a method transactional*

## React and Tailwind:
.jsx ~ *creo un file dentro la cartella "components"*
rfc ~ per creare un componente react

## Maven
mvn clean package -DskipTests ~ run the test
./mvnw -DskipTests=true clean package ~ alternativa (?)

## Docker
mvn package ~ compilazione codice sorgente
docker build -t user-service:latest . ~ build the container


