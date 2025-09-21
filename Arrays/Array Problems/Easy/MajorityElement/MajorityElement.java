package MajorityElement;

public class MajorityElement { 
    public int majorityElement(int[] nums) {
        int n = nums.length;   // Size of the array
        int cnt = 0;           // Counter for votes
        int el = 0;            // Candidate for majority element

       
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {   // No current candidate or previous candidate canceled out
                cnt = 1;      // Start counting current element
                el = nums[i]; // Pick current element as candidate
            } 
            else if (nums[i] == el) { // Same as candidate
                cnt++;       // Increment vote count
            } 
            else {             // Different element
                cnt--;       // Cancel one vote
            }
        }

        // Step 2: Verify the candidate
        int cnt1 = 0;       
        for (int i = 0; i < n; i++) {
            if (nums[i] == el) {
                cnt1++;       
            }

            if (cnt1 > n / 2) { 
                return el;
            }
        }

    
        return -1;
    }
}

