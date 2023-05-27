import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeakElementTest {

    @Test
    public void testFindPeakElement() {
        int[] nums1 = {1, 2, 3, 1};
        assertEquals(2, findPeakElement(nums1));

        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};
        assertEquals(5, findPeakElement(nums2));

        int[] nums3 = {1, 2, 3, 4, 5};
        assertEquals(4, findPeakElement(nums3));

        int[] nums4 = {5, 4, 3, 2, 1};
        assertEquals(0, findPeakElement(nums4));
    }

    private int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}