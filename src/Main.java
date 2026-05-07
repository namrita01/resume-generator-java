import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Full Name: ");
        String name = sc.nextLine();

        System.out.print("Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Do you have experience? (yes/no): ");
        String hasExperience = sc.nextLine().trim().toLowerCase();

        StringBuilder experienceSection = new StringBuilder();

        if (hasExperience.equals("yes")) {
            System.out.print("No. of Experiences: ");
            int expCount = Integer.parseInt(sc.nextLine());

            experienceSection.append("\\section{Experience}\n")
                    .append("\\resumeSubHeadingListStart\n");

            for (int i = 0; i < expCount; i++) {
                System.out.println("Experience " + (i + 1));
                System.out.print("Role: ");
                String role = sc.nextLine();

                System.out.print("Duration: ");
                String duration = sc.nextLine();

                System.out.print("Company: ");
                String company = sc.nextLine();

                System.out.print("Location: ");
                String location = sc.nextLine();

                System.out.print("No. of bullets: ");
                int bullets = Integer.parseInt(sc.nextLine());

                StringBuilder bulletList = new StringBuilder();
                for (int j = 0; j < bullets; j++) {
                    System.out.print("Bullet " + (j + 1) + ": ");
                    bulletList.append("\\resumeItem{" + sc.nextLine() + "}\n");
                }

                experienceSection.append("\\resumeSubheading\n")
                        .append("{").append(role).append("}{").append(duration).append("}\n")
                        .append("{").append(company).append("}{").append(location).append("}\n")
                        .append("\\resumeItemListStart\n")
                        .append(bulletList)
                        .append("\\resumeItemListEnd\n");
            }

            experienceSection.append("\\resumeSubHeadingListEnd\n");
        }


        System.out.print("LinkedIn URL: ");
        String linkedin = sc.nextLine();

        System.out.print("GitHub URL: ");
        String github = sc.nextLine();

        System.out.print("LeetCode URL: ");
        String leetcode = sc.nextLine();

        System.out.print("About Me: ");
        String about = sc.nextLine();

        System.out.print("College Name: ");
        String college = sc.nextLine();

        System.out.print("College Location: ");
        String collegeLocation = sc.nextLine();

        System.out.print("Degree & Branch: ");
        String degree = sc.nextLine();

        System.out.print("College Duration: ");
        String collegeDuration = sc.nextLine();

        System.out.print("School Name (12th): ");
        String school12 = sc.nextLine();

        System.out.print("12th Duration: ");
        String school12Dur = sc.nextLine();

        System.out.print("School Name (10th): ");
        String school10 = sc.nextLine();

        System.out.print("10th Duration: ");
        String school10Dur = sc.nextLine();

        StringBuilder skillSection = new StringBuilder();
        System.out.print("No. of skill categories (e.g., Languages, Tools): ");
        int skillCategories = Integer.parseInt(sc.nextLine());

        skillSection.append("\\section{Technical Skills}\n")
                .append("\\begin{itemize}[leftmargin=0.15in, label={}]\n")
                .append("\\small{\\item{\n");

        for (int i = 0; i < skillCategories; i++) {
            System.out.print("Skill category " + (i + 1) + " name: ");
            String category = sc.nextLine();

            System.out.print("Technologies under " + category + ": ");
            String techs = sc.nextLine();

            skillSection.append("\\textbf{" + category + "}{: " + techs + "} \\\\\n");
        }

        skillSection.append("}}\n\\end{itemize}\n");

        StringBuilder certificationSection = new StringBuilder();
        System.out.print("Do you have any certifications? (yes/no): ");
        String hasCert = sc.nextLine();

        if (hasCert.equalsIgnoreCase("yes")) {
            System.out.print("No. of certifications: ");
            int certCount = Integer.parseInt(sc.nextLine());

            certificationSection.append("\\section{Certifications}\n\\resumeSubHeadingListStart\n");

            for (int i = 0; i < certCount; i++) {
                System.out.println("Certification " + (i + 1));
                System.out.print("Title: ");
                String certTitle = sc.nextLine();

                System.out.print("Issuer: ");
                String issuer = sc.nextLine();

                System.out.print("Year: ");
                String certYear = sc.nextLine();

                certificationSection.append("\\resumeProjectHeading\n")
                        .append("{\\textbf{" + certTitle + "} $|$ \\emph{" + issuer + "}}{" + certYear + "}\n");
            }

            certificationSection.append("\\resumeSubHeadingListEnd\n");
        }

        StringBuilder achievementSection = new StringBuilder();
        System.out.print("Do you have any achievements? (yes/no): ");
        String hasAchieve = sc.nextLine();

        if (hasAchieve.equalsIgnoreCase("yes")) {
            System.out.print("No. of achievements: ");
            int achieveCount = Integer.parseInt(sc.nextLine());

            achievementSection.append("\\section{Achievements}\n\\resumeSubHeadingListStart\n");

            for (int i = 0; i < achieveCount; i++) {
                System.out.println("Achievement " + (i + 1));
                System.out.print("Title: ");
                String title = sc.nextLine();

                System.out.print("Year: ");
                String year = sc.nextLine();

                System.out.print("Do you want to add bullet points? (yes/no): ");
                String hasBullets = sc.nextLine();

                achievementSection.append("\\resumeProjectHeading\n")
                        .append("{\\textbf{" + title + "}}{" + year + "}\n");

                if (hasBullets.equalsIgnoreCase("yes")) {
                    System.out.print("No. of bullets: ");
                    int bullets = Integer.parseInt(sc.nextLine());

                    achievementSection.append("\\resumeItemListStart\n");
                    for (int j = 0; j < bullets; j++) {
                        System.out.print("Bullet " + (j + 1) + ": ");
                        achievementSection.append("\\resumeItem{" + sc.nextLine() + "}\n");
                    }
                    achievementSection.append("\\resumeItemListEnd\n");
                }
            }

            achievementSection.append("\\resumeSubHeadingListEnd\n");
        }

        System.out.print("No. of Projects: ");
        int projectCount = Integer.parseInt(sc.nextLine());

        StringBuilder projectSection = new StringBuilder();
        for (int i = 0; i < projectCount; i++) {
            System.out.println("Project " + (i + 1));
            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Technologies: ");
            String tech = sc.nextLine();

            System.out.print("Year: ");
            String year = sc.nextLine();

            System.out.print("No. of bullets: ");
            int bullets = Integer.parseInt(sc.nextLine());

            StringBuilder bulletList = new StringBuilder();
            for (int j = 0; j < bullets; j++) {
                System.out.print("Bullet " + (j + 1) + ": ");
                bulletList.append("\\resumeItem{" + sc.nextLine() + "}\n");
            }

            projectSection.append("\\resumeProjectHeading\n")
                    .append("{\\textbf{").append(title).append("} $|$ \\emph{").append(tech).append("}}{").append(year).append("}\n")
                    .append("\\resumeItemListStart\n")
                    .append(bulletList)
                    .append("\\resumeItemListEnd\n");
        }

        sc.close();

        String template = new String(Files.readAllBytes(Paths.get("resume_template_final.tex")));

        template = template.replace("{{NAME}}", name)
                .replace("{{PHONE}}", phone)
                .replace("{{EMAIL}}", email)
                .replace("{{LINKEDIN}}", linkedin)
                .replace("{{GITHUB}}", github)
                .replace("{{LEETCODE}}", leetcode)
                .replace("{{ABOUT}}", about)
                .replace("{{COLLEGE}}", college)
                .replace("{{COLLEGE_LOC}}", collegeLocation)
                .replace("{{DEGREE}}", degree)
                .replace("{{COLLEGE_DUR}}", collegeDuration)
                .replace("{{SCHOOL12}}", school12)
                .replace("{{SCHOOL12_LOC}}", "Uttarakhand")
                .replace("{{CLASS12}}", "Class 12th (PCM)")
                .replace("{{SCHOOL12_DUR}}", school12Dur)
                .replace("{{SCHOOL10}}", school10)
                .replace("{{SCHOOL10_LOC}}", "Uttarakhand")
                .replace("{{CLASS10}}", "Class 10th")
                .replace("{{SCHOOL10_DUR}}", school10Dur)
                .replace("{{SKILLS}}", skillSection.toString())
                .replace("{{CERTIFICATIONS}}", certificationSection.toString())
                .replace("{{ACHIEVEMENTS}}", achievementSection.toString())
                .replace("{{EXPERIENCE}}", experienceSection.toString())
                .replace("{{PROJECTS}}", projectSection.toString());

        String fileName = name.replaceAll(" ", "") + "Resume.tex";
        Files.write(Paths.get(fileName), template.getBytes());
        System.out.println("\nResume written to '" + fileName + "'");
        try {
            ProcessBuilder pb = new ProcessBuilder("pdflatex", fileName);
            pb.inheritIO();
            Process process = pb.start();
            process.waitFor();
            System.out.println("PDF generated successfully.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
