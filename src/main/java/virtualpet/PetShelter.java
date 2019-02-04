package virtualpet;

import java.util.HashMap;

public class PetShelter {

	private HashMap<String, Pet> pets = new HashMap<String, Pet>(); // <key, value>

	public void addPet(Pet virtualPet) {
		pets.put(virtualPet.getPetName(), virtualPet);

	}

	public Pet getPet(String petToGet) {
		return pets.get(petToGet);
	}

	public int getPetsLength() {
		return pets.size();
	}

	public void removePet() {
		for (Pet pet : pets.values()) {
			if (pet.getDeathValue() == -1) {
				pets.remove(pet.getPetName());
			}
		}
	}

//	public void removeRoboticPet() { 
//		for (Pet pet : pets.values()) {
//			if (pet instanceof Robotic) {
//				if (((Robotic) pet).getDeathValue() != 1) {
//				pets.remove(pet.getPetName());
//			}
//		}
//		}
//	}
//	
	public void feedAllPets() {
		for (Pet pet : pets.values()) {
			((Organic) pet).feedPet();
			((Robotic) pet).addOil();
		}
	}

	public void cleanAllPets() {
		for (Pet pet : pets.values()) {
			((Organic) pet).cleanPet();
			((Robotic) pet).maintainence();
		}
	}

	public void playAllPets() {
		for (Pet pet : pets.values()) {
			((Organic) pet).playPet();
		}
	}

	public void sleepAllPets() {
		for (Pet pet : pets.values()) {
			((Organic) pet).sleepPet();
			((Robotic) pet).chargeBattery();
		}
	}

	public void incrementAllPets() {
		for (Pet pet : pets.values()) {
			pet.incrementStatus();
		}
	}

	public void allPetStatus() {
		for (Pet pet : pets.values()) {
			if (pet.getPetAlive()) {
				if (pet instanceof Organic) {
					System.out.println("Pet Status:");
					System.out.println("For pet " + pet.getPetName());
					pet.healthWarning();
					System.out.println("Fullness = " + (((Organic) pet).getPetFullness()));
					System.out.println("Cleanliness = " + ((Organic) pet).getPetCleanliness());
					System.out.println("Energy = " + ((Organic) pet).getPetEnergy());
					System.out.println("Happiness = " + (((Organic) pet).getPetHappiness())); // create method
																								// petStatus?
					System.out.println(pet.getDeathValue());
					System.out.println("----------");
				} else {
					if (pet instanceof Robotic) {
						System.out.println("Pet Status:");
						System.out.println("For pet " + ((Robotic) pet).getPetName());
						pet.healthWarning();
						System.out.println("Oil Level = " + ((Robotic) pet).getPetOilLevel());
						System.out.println("Clean Status = " + ((Robotic) pet).getPetCleanStatus());
						System.out.println("Charge Level = " + ((Robotic) pet).getPetBattery());
						System.out.println(pet.getDeathValue());
						System.out.println("----------");
					}
				}
			}

		}

	}

	public void petNameList() {
		for (Pet pet : pets.values()) {
			if (pet instanceof Organic) {
				System.out.println(pet.getPetName());
			} else {
				if (pet instanceof Robotic) {
					System.out.println(pet.getPetName());
				}
				return;
			}

		}
	}
}
