import { useEffect, useState } from "react";
import axios from "axios";

function ProtectedRoute({ children }) {

    const [isAuthenticated, setIsAuthenticated] = useState(null);

    useEffect(() => {

        axios.get(
            "http://localhost:8080/check-auth",
            {
                withCredentials: true
            }
        )
        .then(() => {
            setIsAuthenticated(true);
        })
        .catch(() => {
            setIsAuthenticated(false);
        });

    }, []);

    if (isAuthenticated === null) {
        return <h2>Loading...</h2>;
    }

    if (!isAuthenticated) {
        window.location.href = "http://localhost:3001";
        return null;
    }

    return children;
}

export default ProtectedRoute;