# GIT: Exercise 3.

- For this task, you will work in a small group. Between 2 and 4 people is about right.

## Main Task:

- First, one person in the group should create a public repository using their GitHub account.
- This same person should then follow the instructions from GitHub to add a remote, and
then push their repository. Do not forget the –u flag, as suggested by GitHub!
- All of the other members of the group should then be added as collaborators, so they can
commit to the repository also.
- Next, everyone else in the group should clone the repository from GitHub. Verify that the
context of the repository is what is expected.
- One of the group members who just cloned should now make a local commit, then push it.
Everyone should verify that when they pull, that commit is added to their local repository
(use git log to check for it).
- Look at each other’s git log output. Notice how the SHA-1 is the same for a given commit
across every copy of the repository. Why is this important?
- Two members of the group should now make a commit locally, and race to push it. To keep
things simple, be sure to edit different files. What happens to the runner-up?
- The runner-up should now pull. As a group, look at the output of the command.
Additionally, look at the git log, and notice that there is a merge commit. You may also
wish to view the DAG in gitk.
- Repeat the last two steps a couple of times, to practice.
