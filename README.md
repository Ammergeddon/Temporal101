<a name="top"></a>

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/Ammergeddon/repo_name">
    <img src="images/temporal.png" alt="Logo" width="80" height="80">
  </a>

<h3 align="center">Temporal 101</h3>

</div>


<!-- ABOUT THE PROJECT -->
## About The Project

This is a repository that is the outcome of the temporal tutorial [Temporal 101 with java](https://temporal.talentlms.com/learner/courseinfo/id:140)<br>
It contains all hands-on exercises as well as some of the demo cases. Further demos and examples can be found in the official [java-samples](https://github.com/temporalio/samples-java) repository from temporal.




### Built With

[![Java][Java]][Java-url]
[![Go][Go]][Go]
[![Temporal][Temporal]][Temporal]



<!-- GETTING STARTED -->
## Getting Started

### Prerequisites

To run these examples [Go](https://go.dev/), [Java](https://www.java.com/en/) and [Temporal](https://learn.temporal.io/getting_started/java/dev_environment/#set-up-a-local-temporal-development-cluster) 
have to be setup on your local machine. To execute a workflow it is necessary for a temporal server to run locally.

  ```sh
  temporal server start-dev --ui-port 8080
  ```

<p align="right"><a href="#top">Back To Top</a></p>



<!-- USAGE EXAMPLES -->
## Usage

After everything is setup specific workflows can either be started via the *Starter* classes or the console:
```shell
    temporal workflow start --type <WorkflowType> --task-queue <task-queue-name> --workflow-id <workflow Id> --input <any necessary input>
```

After you can start a worker to pickup any waiting workflow and execute it. For more information about the interaction
between workflows and workers please refer to the [official documentation](https://learn.temporal.io/getting_started/java/first_program_in_java/).




<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.



<!-- CONTACT -->
## Contact

[![email-shield]][email] [![linkedin-shield]][linkedin-url]



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/Ammergeddon/repo_name.svg?style=for-the-badge
[contributors-url]: https://github.com/Ammergeddon/repo_name/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/Ammergeddon/repo_name.svg?style=for-the-badge
[forks-url]: https://github.com/Ammergeddon/repo_name/network/members
[stars-shield]: https://img.shields.io/github/stars/Ammergeddon/repo_name.svg?style=for-the-badge
[stars-url]: https://github.com/Ammergeddon/repo_name/stargazers
[issues-shield]: https://img.shields.io/github/issues/Ammergeddon/repo_name.svg?style=for-the-badge
[issues-url]: https://github.com/Ammergeddon/repo_name/issues
[license-shield]: https://img.shields.io/github/license/Ammergeddon/repo_name.svg?style=for-the-badge
[license-url]: https://github.com/Ammergeddon/repo_name/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/daniel-f%C3%BCrtig-bb038425a/
[email-shield]: https://img.shields.io/badge/-Email-black.svg?style=for-the-badge&colorB=555
[email]: ammergeddon@hotmail.com
[product-screenshot]: images/screenshot.png
[Next.js]: https://img.shields.io/badge/next.js-000000?style=for-the-badge&logo=nextdotjs&logoColor=white
[Next-url]: https://nextjs.org/
[React.js]: https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB
[React-url]: https://reactjs.org/
[Vue.js]: https://img.shields.io/badge/Vue.js-35495E?style=for-the-badge&logo=vuedotjs&logoColor=4FC08D
[Vue-url]: https://vuejs.org/
[Angular.io]: https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white
[Angular-url]: https://angular.io/
[Svelte.dev]: https://img.shields.io/badge/Svelte-4A4A55?style=for-the-badge&logo=svelte&logoColor=FF3E00
[Svelte-url]: https://svelte.dev/
[Laravel.com]: https://img.shields.io/badge/Laravel-FF2D20?style=for-the-badge&logo=laravel&logoColor=white
[Laravel-url]: https://laravel.com
[Bootstrap.com]: https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white
[Bootstrap-url]: https://getbootstrap.com
[JQuery.com]: https://img.shields.io/badge/jQuery-0769AD?style=for-the-badge&logo=jquery&logoColor=white
[JQuery-url]: https://jquery.com 
[Java]: https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white
[Java-url]: https://www.java.com/en/
[Go]: https://img.shields.io/badge/Go-00ADD8?logo=Go&logoColor=white&style=for-the-badge
[Go-url]: https://go.dev/
[Temporal]: https://img.shields.io/badge/Temporal-000000?style=for-the-badge&logo=temporal&logoColor=white
[Temporal-url]: https://temporal.io/