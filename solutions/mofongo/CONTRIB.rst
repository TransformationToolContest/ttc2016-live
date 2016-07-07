
Contrib
=======

This document describes the different aspects of mofongo's code development and is intended as a guide for users
interested in contributing to the project.

Coding Standards
----------------

Naming
^^^^^^

In short:

module_name, package_name, ClassName, method_name, ExceptionName, functionName, GLOBAL_CONSTANT_NAME, global_var_name, instance_var_name, function_parameter_name, local_var_name


Repository
----------

mofongo uses Git as it version control system and Git Flow as the branching model.

Branch naming
^^^^^^^^^^^^^

Branch should be named using the issue/bug number, using the either of the following three path/locations :

feature/
    For new features
doc/
    For fixing documentation
bug/
    For bugs/issues

All branches must be related to an issue/bug id. Hence, even in-house fixes, new features. etc., should be first added to the issue/bug tracking system.

Commit Messages
^^^^^^^^^^^^^^^

Next we describe the commit message structure/template should be used for all commits to the repository. Note that since square brackets commonly used to denote optional arguments are part of the message's text, angle brackets denote optional arguments.

    [ABC]<[ticketId]><[topicId]><[WIP]> Message

Where,
    ABC
        The type of commit:
            - **add**: New feature/functionality)
            - **mod**: Modifications
            - **fix**: Specific bugfix
            - **str**: Change in structure, e.g. move a file
            - **dep**: New dependency
            - **rem**: Backward incompatibility/remove
            - **rea**: Readability, e.g. fix documentation, remove commented code
            - **ref**: Refactoring
    ticketId
        The issue tracking number of the issue relevant to this commit. The issue number should be prepended by a #.
    topicId
        *Future use*. Can be branch name and/or topic name for gerrit and/or topic name for reviews/discussions.
    WIP
        Work in progress. Used for development location changes (e.g. switching machines) or saving work. The next commit should override this one (i.e. don't leave WIP commits in the repository)::

            git reset HEAD~1
            ... continue work
            git commit
            git push -f

    Message
        Detail of the modification. To use Bitbucket issue tracking integration the message should contain a::

            <command> <issue id>

        section. The following ``<command>`` s should be used:
        
            ======================  ==========  =======
            Action                  Command     Example
            ======================  ==========  =======
            Resolve an issue        resolve     resolve #571
            Reopen an issue         reopen      reopen #724
            mark an issue on hold   hold        hold #982
            mark an issue invalid   invalidate  invalidate #439
            link to other issue(s)  see         see #365
                                    \           see #45 and #894
            ======================  ==========  =======

Examples
~~~~~~~~
::

    [add] New class to support XXX
    [mod] Divided method A into two separate methods.
    [fix][#4261] Added test to avoid invalid address access, resolve #4261.
    [rem][#876] Reverting the changes to the engine until new design is completed, hold #876.
    [ref][WIP] Clean up comments, see #786
