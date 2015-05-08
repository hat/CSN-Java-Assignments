package sample;

public class Soldier extends Person2
{
    private String officerOrEnlisted;
    private String rank;
    private String ssNum;
    private String bloodType;
    private String jobSpecialtyCode;
    private String militaryBranch;
    private final String[] enlistedAirForceRanks = new String[]{"Airman Basic", "Airman", "Airman First Class", "Senior Airman", "Staff Sergeant", "Technical Sergeant", "Master Sergeant", "Senior Master Sergeant", "Chief Master Sergeant", "Command Chief Master Sergeant", "Chief Master Sergeant of the Air Force"};
    private final String[] officerAirForceRanks = new String[]{"Second Lieutenant", "First Lieutenant", "Captain", "Major", "Lieutenant Colonel", "Colonel", "Brigadier General", "Major General", "Lieutenant General", "General", "General of the Air Force"};
    private final String[] enlistedArmyRanks = new String[]{"Private", "Private E-2", "Private First Class", "Corporal"};
    private final String[] officerArmyRanks = new String[]{"Warrant Officer 1", "Chief Warrant Officer 2", "Chief Warrant Officer 3", "Chief Warrant Officer 4", "Chief Warrant Officer 4", "Second Lieutenant", "First Lieutenant", "Captain", "Major", "Lieutenant Colonel", "Colonel", "rigadier General", "Major General", "Lieutenant General", "General", "General of the Army"};
    private final String[] enlistedNavyCoastGuardRanks = new String[]{"Seaman Recruit", "Seaman Apprentice", "Seaman", "Petty Officer Third Class"};
    private final String[] officerNavyCoastGuardRanks = new String[]{"USN Warrant Officer 1", "USN Chief Warrant Officer 2", "USN Chief Warrant Officer 3", "USN Chief Warrant Officer 4", "USN Chief Warrant Officer 5", "Ensign", "Lieutenant Junior Grade", "Lieutenant", "Lieutenant Commander", "Commander", "Captain", "Rear Admiral Lower Half", "Rear Admiral Upper Half", "Vice Admiral", "Admiral", "Fleet Admiral"};
    private final String[] officerMarinesRanks = new String[]{"Warrant Officer 1", "Chief Warrant Officer 2", "Chief Warrant Officer 3", "Chief Warrant Officer 4", "Chief Warrant Officer 4", "Second Lieutenant", "First Lieutenant", "Captain", "Major", "Lieutenant Colonel", "Colonel", "rigadier General", "Major General", "Lieutenant General", "General"};
    private final String[] enlistedMarinesRanks = new String[]{"Private", "Private First Class", "Lance Corporal", "Corporal"};
    private final String[] jobSkillsArmyEnlisted = new String[]{"Army Band", "Interpreter/Translator", "Infantry", "Corps of Engineers", "Field Artillery", "Air Defense Artillery", "Aviation", "Special Forces", "Armor", "Signal Corps", "Judge Advocate General Corps", "Military Police", "Military Intelligence", "Financial Management", "Psychological Operations", "Civil Affairs", "Adjutant General Corps", "Public Affairs", "Acquisition Corps", "Chaplain", "Medical Service Corps", "Chemical", "Transportation", "Quartermaster Corps", "Ordnance Corps"};
    private final String[] jobSkillsArmyOfficer = new String[]{"Medical Corps", "Medical Specialist Corps", "Dental Corps", "Veterinary Corps", "Nurse Corps", "Information Operations", "Strategic Intelligence", "Space Operations", "US Military Academy Stabilized Faculty", "Foreign Area Officer", "Operations Research / Systems Analysis (Orsa)", "Force Management", "Research, Development and Acquisition", "Nuclear and Counterproliferation", "Systems Automation Officer", "Simulations Operations", "Strategist", "Health Services", "Laboratory Sciences", "Preventive Medicine Sciences", "Behavioral Sciences", "Army Band", "Interpreter/Translator", "Infantry", "Corps of Engineers", "Field Artillery", "Air Defense Artillery", "Aviation", "Special Forces", "Armor", "Signal Corps", "Judge Advocate General Corps", "Military Police", "Military Intelligence", "Financial Management", "Psychological Operations", "Civil Affairs", "Adjutant General Corps", "Public Affairs", "Acquisition Corps", "Chaplain", "Medical Service Corps", "Chemical", "Transportation", "Quartermaster Corps", "Ordnance Corps"};
    private final String[] jobSkillsNavyEnlisted = new String[]{"Administration Community", "Aviation Community", "Cryptologic Community", "Intelligence Community", "Medical/Dental Community", "Nuclear Community", "SEABEE Community", "Security Community", "Special Warfare/Special Operations Community", "Submarine Community", "Supply Community", "Surface Combat Systems/Operations Community", "Surface Engineering Community"};
    private final String[] jobSkillsNavyOfficer = new String[]{"Aerospace Maintenance", "Naval Aviator", "Chaplain", "Civil Engineer", "Cryptology", "Engineering Duty Officer", "Intelligence", "JAG", "Medical Services Corps", "Naval Reactors Engineer", "Nuclear Officer", "Nuclear Power School Instructor", "Nurse Corps", "Oceanography", "Public Affairs", "SEAL", "Special Operations", "Supply", "Surface Warfare Officer"};
    private final String[] jobSkillsMarinesEnlisted = new String[]{"Personnel and Administration", "Intelligence", "Infantry", "Logistics", "Mariness Air Ground Task Force (MAGTF) Plans", "Communications", "Field Artillery", "Training", "Utilities", "Engineer, Construction, Facilities, and Equipment", "Tank and Assault Amphibious Vehicle", "Ground Ordnance Maintenance", "Ammunition and Explosive Ordnance Disposal", "Signals Intelligence/Ground Electronic Warfare", "Linguist", "Ground Electronics Maintenance", "Supply Administration and Operations", "Traffic Management", "Food Service", "Financial Management", "Motor Transport", "Mariness Corps Community Services", "Public Affairs", "Legal Services", "Combat Camera", "Music", "Chemical, Biological, Radiological and Nuclear Defense", "Military Police and Corrections", "Electronics Maintenance", "Aircraft Maintenance", "Avionics", "Aviation Ordnance", "Aviation Logistics", "Meteorology and Oceanography", "Airfield Services", "Air Control/Air Support/Anti-air Warfare/Air Traffic Control", "Navigation Officer/Enlisted Flight Crews", "Miscellaneous Requirements MOSs"};
    private final String[] jobSkillsMarinesOfficer = new String[]{"Personnel, Administration, and Retention", "Intelligence", "Infantry", "Mariness Air Ground Task Force (MAGTF) Plans", "Communications", "Field Artillery", "Training", "Utilities", "Engineer, Construction, Facilities, and Equipment", "Tank and Assault Amphibious Vehicle", "Ground Ordance Maintenance", "Ammunition and Explosive Ordnance Disposal", "Signals Intelligence/Ground Electronic Warfare", "Linquist", "Ground Electronics Maintenance", "Supply Administration and Operations", "Traffic Management", "Food Service", "Financial Management", "Mariness Corps Community Services", "Public Affairs", "Legal Services", "Combat Camera (COMCAM)", "Recruiting", "Music", "Chemical, Biological, Radiological and Nuclear (CBRN) Defense", "Military Police and Corrections", "Electronics Maintenance", "Aircraft Maintenance", "Avionics", "Aviation Ordnance", "Aviation Logistics", "Metorology and Oceanography (METOC)", "Airfield Services", "Air Control/Air Support/AntiAir Warfare/Air Traffic Control", "Navigation Officer and Enlisted Flight Crews", "Pilots, Naval Flight Officers", "Miscellaneous Requirements MOS\'s"};
    private final String[] jobSkillsCoastGuardEnlisted = new String[]{"Aviation Maintenance Technician", "Aviation Survival Technician", "Avionics Electrical Technician", "Boatswain\'s Mate", "Damage Controlman", "Electrician\'s Mate", "Electronics Technician", "Food Service Specialist", "Gunner\'s Mate", "Health Services Technician", "Information Systems Technician", "Intelligence Specialist", "Machinery Technician", "Mariness Science Technician", "Maritime Enforcement Specialist", "Operations Specialist", "Public Affairs Specialist", "Storekeeper", "Yeoman"};
    private final String[] jobSkillsCoastGuardOfficer = new String[]{"Law", "Environmental", "Aviation", "Engineering", "Command, Control, Communications", "Computer & Information Technologies", "Intelligence"};
    private final String[] jobSkillsAirForceOfficer = new String[]{"Pilot Field", "Navigator Field", "Space, Missile, And Command And Control Field", "Intelligence Field", "Weather Field", "Operations Support Field", "Logistics Field", "Security Forces Field", "Civil Engineer Field", "Communications And Information Field", "Services Field", "Public Affairs Field", "Mission Support Field", "Manpower Field", "Health Services Field", "Biomedical Clinician Field", "Biomedical Specialists Field", "Physician Field", "Surgery Field", "Nurse Field", "Dental Field", "Aerospace Medicine Field", "Law Field", "Chaplain Field", "Scientific/Research Field", "Developmental Engineering Field", "Acquisition Field", "Contracting Field", "Finance Field", "Special Investigations Field", "Special Duty Assignments"};
    private final String[] jobSkillsAirForceEnlisted = new String[]{"Operations", "Maintenance/Logistics", "Support", "Medical/Dental", "Legal/Chaplain", "Finance/Contracting", "Special Investigations", "Special Duty Assignments", "Special Reporting Identifiers"};

    public Soldier() {
        this.officerOrEnlisted = "Enlisted";
        this.rank = "Airman";
        this.ssNum = "000-00-0000";
        this.bloodType = "O+";
        this.jobSpecialtyCode = "Personnel";
        this.militaryBranch = "Air Force";
    }

    public Soldier(String var1, String var2, int var3, String var4, String var5, String var6, String var7, String var8, String var9, String var10) {
        super(var1, var2, var3, var4);
        if(var3 >= 17 && var3 <= 57) {
            if(this.officerOrEnlisted.equals("Officer") && this.officerOrEnlisted.equals("Enlisted")) {
                this.officerOrEnlisted = var5;
                if(!this.militaryBranch.equals("Coast Guard") && !var10.equals("Air Force") && !var10.equals("Army") && !var10.equals("Navy") && !var10.equals("Marines")) {
                    throw new IllegalArgumentException("The Military Branches are the: Coast Guard, Air Force, Army, Navy, and Marines");
                } else {
                    this.militaryBranch = var10;
                    int var11;
                    if(this.militaryBranch.equals("Coast Guard") && this.officerOrEnlisted.equals("Enlisted")) {
                        for(var11 = 0; var11 <= this.enlistedNavyCoastGuardRanks.length; ++var11) {
                            if(!this.enlistedNavyCoastGuardRanks[var11].equals(var6)) {
                                throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set.");
                            }

                            this.rank = var6;
                        }
                    } else if(this.militaryBranch.equals("Coast Guard") && this.officerOrEnlisted.equals("Officer")) {
                        for(var11 = 0; var11 <= this.officerNavyCoastGuardRanks.length; ++var11) {
                            if(!this.officerNavyCoastGuardRanks[var11].equals(var6)) {
                                throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set.");
                            }

                            this.rank = var6;
                        }
                    } else if(this.militaryBranch.equals("Air Force") && this.officerOrEnlisted.equals("Enlisted")) {
                        for(var11 = 0; var11 <= this.enlistedAirForceRanks.length; ++var11) {
                            if(!this.enlistedAirForceRanks[var11].equals(var6)) {
                                throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set.");
                            }

                            this.rank = var6;
                        }
                    } else if(this.militaryBranch.equals("Air Force") && this.officerOrEnlisted.equals("Officer")) {
                        for(var11 = 0; var11 <= this.officerAirForceRanks.length; ++var11) {
                            if(!this.officerAirForceRanks[var11].equals(var6)) {
                                throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set.");
                            }

                            this.rank = var6;
                        }
                    } else if(this.militaryBranch.equals("Army") && this.officerOrEnlisted.equals("Enlisted")) {
                        for(var11 = 0; var11 <= this.enlistedArmyRanks.length; ++var11) {
                            if(!this.enlistedArmyRanks[var11].equals(var6)) {
                                throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set.");
                            }

                            this.rank = var6;
                        }
                    } else if(this.militaryBranch.equals("Army") && this.officerOrEnlisted.equals("Officer")) {
                        for(var11 = 0; var11 <= this.officerArmyRanks.length; ++var11) {
                            if(!this.officerArmyRanks[var11].equals(var6)) {
                                throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set.");
                            }

                            this.rank = var6;
                        }
                    } else if(this.militaryBranch.equals("Navy") && this.officerOrEnlisted.equals("Enlisted")) {
                        for(var11 = 0; var11 <= this.enlistedNavyCoastGuardRanks.length; ++var11) {
                            if(!this.enlistedNavyCoastGuardRanks[var11].equals(var6)) {
                                throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set.");
                            }

                            this.rank = var6;
                        }
                    } else if(this.militaryBranch.equals("Navy") && this.officerOrEnlisted.equals("Officer")) {
                        for(var11 = 0; var11 <= this.officerNavyCoastGuardRanks.length; ++var11) {
                            if(!this.officerNavyCoastGuardRanks[var11].equals(var6)) {
                                throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set.");
                            }

                            this.rank = var6;
                        }
                    } else if(this.militaryBranch.equals("Marines") && this.officerOrEnlisted.equals("Enlisted")) {
                        for(var11 = 0; var11 <= this.enlistedMarinesRanks.length; ++var11) {
                            if(!this.enlistedMarinesRanks[var11].equals(var6)) {
                                throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set.");
                            }

                            this.rank = var6;
                        }
                    } else if(this.militaryBranch.equals("Marines") && this.officerOrEnlisted.equals("Officer")) {
                        for(var11 = 0; var11 <= this.officerMarinesRanks.length; ++var11) {
                            if(!this.officerMarinesRanks[var11].equals(var6)) {
                                throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set.");
                            }

                            this.rank = var6;
                        }
                    }

                    if(var7.length() == 11) {
                        if(var7.charAt(4) == 45 & var7.charAt(7) == 45) {
                            String var12 = var7.replaceAll("-", "");
                            if(var12.matches("[0-9]+") & var12.length() == 9) {
                                this.ssNum = var7;
                            }
                        }

                        if(!var8.equals("O+") && !var8.equals("O-") && !var8.equals("A+") && !var8.equals("A-") && !var8.equals("B+") && !var8.equals("B-") && !var8.equals("AB+") && !var8.equals("AB-")) {
                            throw new IllegalArgumentException("Invalid blood type... blood types are: O+, O-, A+. A-, B+, B-, AB+, AB-");
                        } else {
                            this.bloodType = var8;
                            if(this.militaryBranch.equals("Coast Guard") && this.officerOrEnlisted.equals("Enlisted")) {
                                for(var11 = 0; var11 <= this.jobSkillsCoastGuardEnlisted.length; ++var11) {
                                    if(!this.jobSkillsCoastGuardEnlisted[var11].equals(var9)) {
                                        throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set, and the Job Specialty is not in the appropriate array.");
                                    }

                                    this.jobSpecialtyCode = var9;
                                }
                            } else if(this.militaryBranch.equals("Coast Guard") && this.officerOrEnlisted.equals("Officer")) {
                                for(var11 = 0; var11 <= this.jobSkillsCoastGuardOfficer.length; ++var11) {
                                    if(!this.jobSkillsCoastGuardOfficer[var11].equals(var9)) {
                                        throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set, and the Job Specialty is not in the appropriate array.");
                                    }

                                    this.jobSpecialtyCode = var9;
                                }
                            } else if(this.militaryBranch.equals("Air Force") && this.officerOrEnlisted.equals("Enlisted")) {
                                for(var11 = 0; var11 <= this.jobSkillsAirForceEnlisted.length; ++var11) {
                                    if(!this.jobSkillsAirForceEnlisted[var11].equals(var9)) {
                                        throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set, and the Job Specialty is not in the appropriate array.");
                                    }

                                    this.jobSpecialtyCode = var9;
                                }
                            } else if(this.militaryBranch.equals("Air Force") && this.officerOrEnlisted.equals("Officer")) {
                                for(var11 = 0; var11 <= this.jobSkillsAirForceOfficer.length; ++var11) {
                                    if(!this.jobSkillsAirForceOfficer[var11].equals(var9)) {
                                        throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set, and the Job Specialty is not in the appropriate array.");
                                    }

                                    this.jobSpecialtyCode = var9;
                                }
                            } else if(this.militaryBranch.equals("Army") && this.officerOrEnlisted.equals("Enlisted")) {
                                for(var11 = 0; var11 <= this.jobSkillsArmyEnlisted.length; ++var11) {
                                    if(!this.jobSkillsArmyEnlisted[var11].equals(var9)) {
                                        throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set, and the Job Specialty is not in the appropriate array.");
                                    }

                                    this.jobSpecialtyCode = var9;
                                }
                            } else if(this.militaryBranch.equals("Army") && this.officerOrEnlisted.equals("Officer")) {
                                for(var11 = 0; var11 <= this.jobSkillsArmyOfficer.length; ++var11) {
                                    if(!this.jobSkillsArmyOfficer[var11].equals(var9)) {
                                        throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set, and the Job Specialty is not in the appropriate array.");
                                    }

                                    this.jobSpecialtyCode = var9;
                                }
                            } else if(this.militaryBranch.equals("Navy") && this.officerOrEnlisted.equals("Enlisted")) {
                                for(var11 = 0; var11 <= this.jobSkillsNavyEnlisted.length; ++var11) {
                                    if(!this.jobSkillsNavyEnlisted[var11].equals(var9)) {
                                        throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set, and the Job Specialty is not in the appropriate array.");
                                    }

                                    this.jobSpecialtyCode = var9;
                                }
                            } else if(this.militaryBranch.equals("Navy") && this.officerOrEnlisted.equals("Officer")) {
                                for(var11 = 0; var11 <= this.jobSkillsNavyOfficer.length; ++var11) {
                                    if(!this.jobSkillsNavyOfficer[var11].equals(var9)) {
                                        throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set, and the Job Specialty is not in the appropriate array.");
                                    }

                                    this.jobSpecialtyCode = var9;
                                }
                            } else if(this.militaryBranch.equals("Marines") && this.officerOrEnlisted.equals("Enlisted")) {
                                for(var11 = 0; var11 <= this.jobSkillsMarinesEnlisted.length; ++var11) {
                                    if(!this.jobSkillsMarinesEnlisted[var11].equals(var9)) {
                                        throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set, and the Job Specialty is not in the appropriate array.");
                                    }

                                    this.jobSpecialtyCode = var9;
                                }
                            } else if(this.militaryBranch.equals("Marines") && this.officerOrEnlisted.equals("Officer")) {
                                for(var11 = 0; var11 <= this.jobSkillsMarinesOfficer.length; ++var11) {
                                    if(!this.jobSkillsMarinesOfficer[var11].equals(var9)) {
                                        throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set, and the Job Specialty is not in the appropriate array.");
                                    }

                                    this.jobSpecialtyCode = var9;
                                }
                            }

                        }
                    } else {
                        throw new IllegalArgumentException("Invalid SS#... Please enter digits 0-9, and use a hyphen to separate numbers. Example:000-00-000");
                    }
                }
            } else {
                throw new IllegalArgumentException("Please enter Officer or Enlisted");
            }
        } else {
            throw new IllegalArgumentException("Please enter ages from 17-57");
        }
    }

    public void setOfficerOrEnlisted(String var1) {
        if(!var1.equals("Officer") && !var1.equals("Enlisted")) {
            throw new IllegalArgumentException("Please enter Officer or Enlisted");
        } else {
            this.officerOrEnlisted = var1;
        }
    }

    public void setRank(String var1) {
        int var2;
        if(this.militaryBranch.equals("Coast Guard") && this.officerOrEnlisted.equals("Enlisted")) {
            for(var2 = 0; var2 <= this.enlistedNavyCoastGuardRanks.length; ++var2) {
                if(!this.enlistedNavyCoastGuardRanks[var2].equals(var1)) {
                    throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set.");
                }

                this.rank = var1;
            }
        } else if(this.militaryBranch.equals("Coast Guard") && this.officerOrEnlisted.equals("Officer")) {
            for(var2 = 0; var2 <= this.officerNavyCoastGuardRanks.length; ++var2) {
                if(!this.officerNavyCoastGuardRanks[var2].equals(var1)) {
                    throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set.");
                }

                this.rank = var1;
            }
        } else if(this.militaryBranch.equals("Air Force") && this.officerOrEnlisted.equals("Enlisted")) {
            for(var2 = 0; var2 <= this.enlistedAirForceRanks.length; ++var2) {
                if(!this.enlistedAirForceRanks[var2].equals(var1)) {
                    throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set.");
                }

                this.rank = var1;
            }
        } else if(this.militaryBranch.equals("Air Force") && this.officerOrEnlisted.equals("Officer")) {
            for(var2 = 0; var2 <= this.officerAirForceRanks.length; ++var2) {
                if(!this.officerAirForceRanks[var2].equals(var1)) {
                    throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set.");
                }

                this.rank = var1;
            }
        } else if(this.militaryBranch.equals("Army") && this.officerOrEnlisted.equals("Enlisted")) {
            for(var2 = 0; var2 <= this.enlistedArmyRanks.length; ++var2) {
                if(!this.enlistedArmyRanks[var2].equals(var1)) {
                    throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set.");
                }

                this.rank = var1;
            }
        } else if(this.militaryBranch.equals("Army") && this.officerOrEnlisted.equals("Officer")) {
            for(var2 = 0; var2 <= this.officerArmyRanks.length; ++var2) {
                if(!this.officerArmyRanks[var2].equals(var1)) {
                    throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set.");
                }

                this.rank = var1;
            }
        } else if(this.militaryBranch.equals("Navy") && this.officerOrEnlisted.equals("Enlisted")) {
            for(var2 = 0; var2 <= this.enlistedNavyCoastGuardRanks.length; ++var2) {
                if(!this.enlistedNavyCoastGuardRanks[var2].equals(var1)) {
                    throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set.");
                }

                this.rank = var1;
            }
        } else if(this.militaryBranch.equals("Navy") && this.officerOrEnlisted.equals("Officer")) {
            for(var2 = 0; var2 <= this.officerNavyCoastGuardRanks.length; ++var2) {
                if(!this.officerNavyCoastGuardRanks[var2].equals(var1)) {
                    throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set.");
                }

                this.rank = var1;
            }
        } else if(this.militaryBranch.equals("Marines") && this.officerOrEnlisted.equals("Enlisted")) {
            for(var2 = 0; var2 <= this.enlistedMarinesRanks.length; ++var2) {
                if(!this.enlistedMarinesRanks[var2].equals(var1)) {
                    throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set.");
                }

                this.rank = var1;
            }
        } else if(this.militaryBranch.equals("Marines") && this.officerOrEnlisted.equals("Officer")) {
            for(var2 = 0; var2 <= this.officerMarinesRanks.length; ++var2) {
                if(!this.officerMarinesRanks[var2].equals(var1)) {
                    throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set.");
                }

                this.rank = var1;
            }
        }

    }

    public void setSSNum(String var1) {
        if(var1.length() == 11) {
            if(var1.charAt(4) == 45 & var1.charAt(7) == 45) {
                String var2 = var1.replaceAll("-", "");
                if(var2.matches("[0-9]+") & var2.length() == 9) {
                    this.ssNum = var1;
                }
            }

        } else {
            throw new IllegalArgumentException("Invalid SS#... Please enter digits 0-9, and use a hyphen to separate numbers. Example:000-00-000");
        }
    }

    public void setBloodType(String var1) {
        if(!var1.equals("O+") && !var1.equals("O-") && !var1.equals("A+") && !var1.equals("A-") && !var1.equals("B+") && !var1.equals("B-") && !var1.equals("AB+") && !var1.equals("AB-")) {
            throw new IllegalArgumentException("Invalid blood type... blood types are: O+, O-, A+. A-, B+, B-, AB+, AB-");
        } else {
            this.bloodType = var1;
        }
    }

    public void setJobSpecialtyCode(String var1) {
        int var2;
        if(this.militaryBranch.equals("Coast Guard") && this.officerOrEnlisted.equals("Enlisted")) {
            for(var2 = 0; var2 <= this.jobSkillsCoastGuardEnlisted.length; ++var2) {
                if(!this.jobSkillsCoastGuardEnlisted[var2].equals(var1)) {
                    throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set, and the Job Specialty is not in the appropriate array.");
                }

                this.jobSpecialtyCode = var1;
            }
        } else if(this.militaryBranch.equals("Coast Guard") && this.officerOrEnlisted.equals("Officer")) {
            for(var2 = 0; var2 <= this.jobSkillsCoastGuardOfficer.length; ++var2) {
                if(!this.jobSkillsCoastGuardOfficer[var2].equals(var1)) {
                    throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set, and the Job Specialty is not in the appropriate array.");
                }

                this.jobSpecialtyCode = var1;
            }
        } else if(this.militaryBranch.equals("Air Force") && this.officerOrEnlisted.equals("Enlisted")) {
            for(var2 = 0; var2 <= this.jobSkillsAirForceEnlisted.length; ++var2) {
                if(!this.jobSkillsAirForceEnlisted[var2].equals(var1)) {
                    throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set, and the Job Specialty is not in the appropriate array.");
                }

                this.jobSpecialtyCode = var1;
            }
        } else if(this.militaryBranch.equals("Air Force") && this.officerOrEnlisted.equals("Officer")) {
            for(var2 = 0; var2 <= this.jobSkillsAirForceOfficer.length; ++var2) {
                if(!this.jobSkillsAirForceOfficer[var2].equals(var1)) {
                    throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set, and the Job Specialty is not in the appropriate array.");
                }

                this.jobSpecialtyCode = var1;
            }
        } else if(this.militaryBranch.equals("Army") && this.officerOrEnlisted.equals("Enlisted")) {
            for(var2 = 0; var2 <= this.jobSkillsArmyEnlisted.length; ++var2) {
                if(!this.jobSkillsArmyEnlisted[var2].equals(var1)) {
                    throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set, and the Job Specialty is not in the appropriate array.");
                }

                this.jobSpecialtyCode = var1;
            }
        } else if(this.militaryBranch.equals("Army") && this.officerOrEnlisted.equals("Officer")) {
            for(var2 = 0; var2 <= this.jobSkillsArmyOfficer.length; ++var2) {
                if(!this.jobSkillsArmyOfficer[var2].equals(var1)) {
                    throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set, and the Job Specialty is not in the appropriate array.");
                }

                this.jobSpecialtyCode = var1;
            }
        } else if(this.militaryBranch.equals("Navy") && this.officerOrEnlisted.equals("Enlisted")) {
            for(var2 = 0; var2 <= this.jobSkillsNavyEnlisted.length; ++var2) {
                if(!this.jobSkillsNavyEnlisted[var2].equals(var1)) {
                    throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set, and the Job Specialty is not in the appropriate array.");
                }

                this.jobSpecialtyCode = var1;
            }
        } else if(this.militaryBranch.equals("Navy") && this.officerOrEnlisted.equals("Officer")) {
            for(var2 = 0; var2 <= this.jobSkillsNavyOfficer.length; ++var2) {
                if(!this.jobSkillsNavyOfficer[var2].equals(var1)) {
                    throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set, and the Job Specialty is not in the appropriate array.");
                }

                this.jobSpecialtyCode = var1;
            }
        } else if(this.militaryBranch.equals("Marines") && this.officerOrEnlisted.equals("Enlisted")) {
            for(var2 = 0; var2 <= this.jobSkillsMarinesEnlisted.length; ++var2) {
                if(!this.jobSkillsMarinesEnlisted[var2].equals(var1)) {
                    throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set, and the Job Specialty is not in the appropriate array.");
                }

                this.jobSpecialtyCode = var1;
            }
        } else if(this.militaryBranch.equals("Marines") && this.officerOrEnlisted.equals("Officer")) {
            for(var2 = 0; var2 <= this.jobSkillsMarinesOfficer.length; ++var2) {
                if(!this.jobSkillsMarinesOfficer[var2].equals(var1)) {
                    throw new IllegalArgumentException("The value of the Military Branch is not Air Force, Army, Marines, Navy, or Coast Guard, and the value of Officer or Enlisted is not set, and the Job Specialty is not in the appropriate array.");
                }

                this.jobSpecialtyCode = var1;
            }
        }

    }

    public void setMilitaryBranch(String var1) {
        if(!this.militaryBranch.equals("Coast Guard") && !var1.equals("Air Force") && !var1.equals("Army") && !var1.equals("Navy") && !var1.equals("Marines")) {
            throw new IllegalArgumentException("The Military Branches are the: Coast Guard, Air Force, Army, Navy, and Marines");
        } else {
            this.militaryBranch = var1;
        }
    }

    public String getRank() {
        return this.rank;
    }

    public String getSSNum() {
        return this.ssNum;
    }

    public String getBloodType() {
        return this.bloodType;
    }

    public String getJobSpecialtyCode() {
        return this.jobSpecialtyCode;
    }

    public String getMilitaryBranch() {
        return this.militaryBranch;
    }
}
