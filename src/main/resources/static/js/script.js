async function checkPalindrome() {

    const input = document
        .getElementById("nameInput")
        .value
        .trim();

    const result = document.getElementById("result");

    const original = document.getElementById("original");
    const reversed = document.getElementById("reversed");
    const characterCount =
        document.getElementById("characterCount");

    const status = document.getElementById("status");

    if (!input) {

        result.className = "result error";

        status.innerHTML =
            "Please enter a name or sentence.";

        return;
    }

    try {

        const response = await fetch(
            `/api/palindrome/${encodeURIComponent(input)}`
        );

        if (!response.ok) {
            throw new Error("API request failed");
        }

        const data = await response.json();

        original.textContent = data.input;

        reversed.textContent = data.reversed;

        characterCount.textContent =
            data.characterCount;

        if (data.palindrome) {

            result.className = "result success";

            status.innerHTML =
                `✓ ${data.message}`;

        } else {

            result.className = "result error";

            status.innerHTML =
                `✗ ${data.message}`;
        }

    } catch (error) {

        result.className = "result error";

        status.innerHTML =
            "Unable to connect to the server.";

        console.error(error);
    }
}